const http = require('http');
const server = http.createServer((req, res) => {
  res.end('Chuc mung! Ban da build thanh cong Multi-stage cho Node.js');
});
server.listen(3000, () => {
  console.log('Server dang chay tai cong 3000');
});