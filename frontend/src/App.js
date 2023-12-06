import './App.css';
import { PlayerView } from './view/PlayerView';
import { BrowserRouter, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="players" element={<PlayerView />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
