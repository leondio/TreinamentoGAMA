# seleciona tudo da tabela funcionários
SELECT 
    *
FROM
    funcionarios;

#insert into funcionarios (matricula, nome, salario) values (null, "joao", 1000);

# selecione os nomes de todos os funcionários
SELECT 
    nome
FROM
    funcionarios;

# liste todos os nomes dos funcionários que ganham mais de R$500,00
SELECT 
    nome
FROM
    funcionarios
WHERE
    salario > 500;

# altere o salario do funcionario com nome 1 para R$1200
UPDATE funcionarios 
SET 
    salario = 1200
WHERE
    matricula = 1;

DELETE FROM funcionarios 
WHERE
    salario > 10000;
    
insert into dependentes values (null,"Joao", str_to_date("01/05/2020","%d/%m/%Y"),1);

# nomes dos funcinarios e seus dependentes quando houver
SELECT 
    func.nome, dep.nome
FROM
    funcionarios AS func
        INNER JOIN
    dependentes AS dep ON func.matricula = dep.matricula
WHERE
    func.salario > 500;
    
###
SELECT 
    func.nome, dep.nome
FROM
    funcionarios AS func
        LEFT JOIN
    dependentes AS dep ON func.matricula = dep.matricula
WHERE
    func.salario > 500;

# calcule a soma dos salários dos funcionários
SELECT 
    SUM(salario)
FROM
    funcionarios
WHERE
    departamento LIKE "T%";