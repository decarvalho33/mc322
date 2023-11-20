# MC322

Curso de Programação Orientada a Objetos na UNICAMP, 

feito em dupla com @RaphaelSVSouza.

### OBS: foram utilizados os princípios SOLID neste sistema. Como por exemplo:
 
## S: Single Responsibility Principle

## S: Single Responsibility Principle

-  **O que?** 

	Como o nome sugere, de acordo com esse princípio cada classe deve ter uma única responsabilidade principal.
	
- **Por que?**

	Usamos esse princípio pois ele torna o programa devidamente modular, logo evitando excesso de acoplamentos que poderiam tornar o sistema mais complexo, além do fato de que sempre que precisarmos alterar uma classe, só faremos isso com um único propósito, o que facilita possíveis refatorações.
- **Como?**

	Analisamos a função principal da classe e tornamos elas exclusivas para aquela função. Alguns exemplo: as classes Empréstimo, Devolução, Renovação e Reserva apenas registram as informações de suas respectivas operações, enquanto EmpréstimoService, DevoluçãoService, RenovaçãoService e ReservaService executam de fato as operações.
