import './App.css';
import { ItemView } from './view/ItemView';
import { PlayerView } from './view/PlayerView';
import { BrowserRouter, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="items" element={<ItemView />} />
        <Route path="players" element={<PlayerView />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
