USE siga

GO
INSERT INTO Aluno VALUES
('Fulano da Silva'),
('Cicrano Vieira'),
('Beltrano Santos'),
('José da Silva'),
('Maria da Silva'),
('Rafaela Pereira'),
('Karina Ferreira'),
('Kaellen Macedo')

GO
INSERT INTO Curso VALUES
('ADS'),
('COMEX')

GO
INSERT INTO Disciplina VALUES
('4203-010', 'Arquitetura e Organização de Computadores', 'AOC', 'T', 80, 1),
('4203-020', 'Arquitetura e Organização de Computadores', 'AOC', 'N', 80, 1),
('4208-010', 'Laboratório de Hardware', 'LHW', 'T', 40, 1),
('4226-004', 'Banco de Dados', 'BDD', 'T', 80, 1),
('4213-003', 'Sistemas Operacionais I', 'SOI', 'T', 80, 1),
('4213-013', 'Sistemas Operacionais I', 'SOI', 'N', 80, 1),
('4233-005', 'Laboratório de Banco de Dados', 'LBD', 'T', 80, 1),
('5005-220', 'Métodos Para a Produção do Conhecimento', 'MPC', 'T', 40, 2)

GO
INSERT INTO Avaliacao VALUES
('P1'),
('P2'),
('T'),
('P3'),
('PE'),
('MC'),
('MR')

GO
--===============================> TESTES <============================--

-- ADIÇÃO DAS NOTAS DOS ALUNOS

-- Aluno: 1111 na Disciplina: AOC T
EXEC sp_insertNotas 1111, '4203-010', 1, 10.00
GO
EXEC sp_insertNotas 1111, '4203-010', 2, 8.00
GO
EXEC sp_insertNotas 1111, '4203-010', 3, 8.00
GO
-- Aluno: 1112 na Disciplina: SOI T
EXEC sp_insertNotas 1112, '4213-003', 1, 9.00
GO
EXEC sp_insertNotas 1112, '4213-003', 2, 6.00
GO
EXEC sp_insertNotas 1112, '4213-003', 3, 6.00
GO
-- Aluno: 1113 na Disciplina: AOC T
EXEC sp_insertNotas 1111, '4203-010', 1, 4.00
GO
EXEC sp_insertNotas 1113, '4203-010', 2, 4.00
GO
EXEC sp_insertNotas 1113, '4203-010', 3, 4.00
GO
-- Aluno: 1114 na Disciplina: AOC T
EXEC sp_insertNotas 1114, '4203-010', 1, 2.00
GO
EXEC sp_insertNotas 1114, '4203-010', 2, 5.00
GO
EXEC sp_insertNotas 1114, '4203-010', 3, 1.00
GO
EXEC sp_insertNotas 1114, '4203-010', 4, 2.50
GO
-- Aluno: 1111 na Disciplina: LBD T
EXEC sp_insertNotas 1111, '4233-005', 1, 10.00 -- P1
GO
EXEC sp_insertNotas 1111, '4233-005', 2, 10.00 -- P2
GO
EXEC sp_insertNotas 1111, '4233-005', 3, 5.00 -- P3 (em vez de T)
GO
-- Aluno: 1112 na Disciplina: LBD T
EXEC sp_insertNotas 1112, '4233-005', 1, 3.00 -- P1
GO
EXEC sp_insertNotas 1112, '4233-005', 2, 4.00 -- P2
GO
EXEC sp_insertNotas 1112, '4233-005', 3, 3.00 -- P3 (em vez de T)
GO
EXEC sp_insertNotas 1112, '4233-005', 3, 10.00 -- P4
GO
-- Aluno: 1113 na Disciplina: LBD T
EXEC sp_insertNotas 1113, '4233-005', 1, 8.00 -- P1
GO
EXEC sp_insertNotas 1113, '4233-005', 2, 7.00 -- P2
GO
EXEC sp_insertNotas 1113, '4233-005', 3, 9.00 -- P3 (em vez de T)
GO
-- Aluno: 1114 na Disciplina: LBD T
EXEC sp_insertNotas 1114, '4233-005', 1, 9.00 -- P1
GO
EXEC sp_insertNotas 1114, '4233-005', 2, 9.00 -- P2
GO
EXEC sp_insertNotas 1114, '4233-005', 3, 5.00 -- P3 (em vez de T)
GO
-- Aluno: 1115 na Disciplina: LBD T
EXEC sp_insertNotas 1115, '4233-005', 1, 3.00 -- P1
GO
EXEC sp_insertNotas 1115, '4233-005', 2, 4.00 -- P2
GO
EXEC sp_insertNotas 1115, '4233-005', 3, 3.00 -- P3 (em vez de T)
GO
-- Aluno: 1116 na Disciplina: LBD T
EXEC sp_insertNotas 1116, '4233-005', 1, 3.00 -- P1
GO
EXEC sp_insertNotas 1116, '4233-005', 2, 4.00 -- P2
GO
EXEC sp_insertNotas 1116, '4233-005', 3, 3.00 -- P3 (em vez de T)
GO
EXEC sp_insertNotas 1116, '4233-005', 4, 3.00 -- E
GO
-- Aluno: 1117 na Disciplina: LBD T
EXEC sp_insertNotas 1117, '4233-005', 1, 10.00 -- P1
GO
EXEC sp_insertNotas 1117, '4233-005', 2, 5.00 -- P2
GO
EXEC sp_insertNotas 1117, '4233-005', 3, 5.00 -- P3 (em vez de T)
GO
-- Aluno: 1117 na Disciplina: MPC T
EXEC sp_insertNotas 1117, '5005-220', 6, 7.00 -- MC
GO
EXEC sp_insertNotas 1117, '5005-220', 7, 4.00 -- MR
GO
-- Aluno: 1118 na Disciplina: SOI T
EXEC sp_insertNotas 1118, '4213-003', 1, 3.00 -- P1
GO
EXEC sp_insertNotas 1118, '4213-003', 2, 4.00 -- P2
GO
EXEC sp_insertNotas 1118, '4213-003', 3, 3.00 -- T
GO
EXEC sp_insertNotas 1118, '4213-003', 5, 5.00 -- PE
GO
EXEC sp_insertNotas 1118, '4213-003', 4, 3.00 -- E
GO
--=================================================================================================
-- ADIÇÃO DAS PRESENCAS DOS ALUNOS

-- AOC T
EXEC sp_insertFaltas 1111, '4203-010', 0
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1112, '4203-010', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1113, '4203-010', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1114, '4203-010', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1115, '4203-010', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1116, '4203-010', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1117, '4203-010', @random
GO

-- LHW T
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 3 AS INTEGER))
EXEC sp_insertFaltas 1111, '4208-010', @random
GO
EXEC sp_insertFaltas 1112, '4208-010', 0
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 3 AS INTEGER))
EXEC sp_insertFaltas 1113, '4208-010', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 3 AS INTEGER))
EXEC sp_insertFaltas 1114, '4208-010', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 3 AS INTEGER))
EXEC sp_insertFaltas 1115, '4208-010', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 3 AS INTEGER))
EXEC sp_insertFaltas 1116, '4208-010', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 3 AS INTEGER))
EXEC sp_insertFaltas 1117, '4208-010', @random
GO

-- BDD
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1111, '4226-004', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1112, '4226-004', @random
GO
EXEC sp_insertFaltas 1113, '4226-004', 0
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1114, '4226-004', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1115, '4226-004', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1116, '4226-004', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1117, '4226-004', @random
GO

-- SOI T
EXEC sp_insertFaltas 1111, '4213-003', 0
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1112, '4213-003', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1113, '4213-003', @random
GO


-- LBD T
EXEC sp_insertFaltas 1111, '4233-005', 0
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1112, '4233-005', @random
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1113, '4233-005', @random
GO
EXEC sp_insertFaltas 1114, '4233-005', 0
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1115, '4233-005', @random
GO
EXEC sp_insertFaltas 1116, '4233-005', 0
GO
DECLARE @random INT
SET @random = (SELECT CAST(RAND() * 5 AS INTEGER))
EXEC sp_insertFaltas 1117, '4233-005', @random
GO

-- MPC T
EXEC sp_insertFaltas 1118, '5005-220', 0
GO


--=================================================================================================
SELECT * FROM fn_selectNotas('4203-010')
SELECT * FROM fn_selectNotas('4213-003')
SELECT * FROM fn_selectNotas('4233-005')
SELECT * FROM fn_selectNotas('5005-220')

SELECT * FROM fn_selectFaltas('4203-010') -- AOC T
-- SELECT * FROM fn_selectFaltas('4203-020') -- AOC N
SELECT * FROM fn_selectFaltas('4208-010') -- LHW T
SELECT * FROM fn_selectFaltas('4226-004') -- BDD T
SELECT * FROM fn_selectFaltas('4213-003') -- SOI T
-- SELECT * FROM fn_selectFaltas('4213-013') -- SOI N
SELECT * FROM fn_selectFaltas('4233-005') -- LBD T
SELECT * FROM fn_selectFaltas('5005-220') -- MPC T
