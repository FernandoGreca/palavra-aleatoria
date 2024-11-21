import { useEffect, useState } from 'react'
import { FaRegLightbulb } from "react-icons/fa"
import './App.css'

function App() {

  // Objeto palavra
  const palavraModel = {
    palavra: '',
    dica: '',
    descricao: ''
  }

  const [palavra, setPalavra] = useState(palavraModel);
  const [resposta, setResposta] = useState('');
  const [listaTentativa, setListaTentativa] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/buscarPalavraAleatoriamente')
      .then(response => {
        if (!response.ok) {
          throw new Error(`HTTP error! status: ${response.status}`);
        }
        return response.json();
      })
      .then(palavraAleatoria_json => setPalavra(palavraAleatoria_json))
      .catch(error => console.error('Erro ao buscar palavra aleatória:', error));
  }, []);

  function verificarResposta(e) {
    e.preventDefault();

    var palavraApi = palavra.palavra.toLowerCase();
    var palavraDescricao = palavra.descricao;
    var palavraResposta = resposta.toLowerCase();

    if (palavraResposta.length < 1) {
      return;
    }

    setListaTentativa([...listaTentativa, palavraResposta]);

    if (palavraApi === palavraResposta) {
      alert('Parabéns!! Você acertou a palavra secreta!!');
      alert('Palavra: ' + palavraApi + ' Descricao: ' + palavraDescricao);
      location.reload();
    }

    setResposta('');
    return;
  }


  return (
    <>
      <div className='container d-flex flex-column align-items-center'>
        <div className='conteudo'>
          <h1 className='text-light'>Palavra Aleatória</h1>
          {palavra && (
            <div className='d-flex align-items-center gap-3 mb-3'>
              <p className='tamanhoPalavra text-light'>Tamanho da palavra: {palavra.palavra.length}</p>
              {/* Botão Modal */}
              <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#exampleModal">
                <FaRegLightbulb />
              </button>

              {/* Conteúdo do Modal */}
              <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header">
                      <h1 class="modal-title fs-5" id="exampleModalLabel">Dica</h1>
                      <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                      <p><strong>{palavra.dica}.</strong></p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          )}

          <div className='row mb-3'>
            <div className='col-xl-4 campo-resposta'>
              <form className='d-flex gap-2'>
                <input
                  type='text'
                  className='form-control mb-2'
                  value={resposta}
                  onChange={(e) => setResposta(e.target.value)}
                  maxLength={palavra.palavra.length}
                  placeholder='Coloque seu chute aqui...' />

                <button className='btn btn-success' onClick={verificarResposta}>Tentar</button>
              </form>
            </div>
          </div>

          <div className="lista-container">
            {listaTentativa.slice().reverse().map((item, index) => (
              <li key={index} className="text-light">{item}</li>
            ))}
          </div>

        </div>
      </div>

    </>
  )
}

export default App
