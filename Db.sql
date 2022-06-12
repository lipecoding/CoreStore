-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.24-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for corestore
CREATE DATABASE IF NOT EXISTS `corestore` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `corestore`;

-- Dumping structure for table corestore.cliente
CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int(5) NOT NULL AUTO_INCREMENT,
  `email` varchar(60) NOT NULL,
  `senha` varchar(6) NOT NULL,
  `nome` varchar(15) NOT NULL,
  `sobrenome` varchar(35) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `idade` int(2) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `cep` varchar(8) NOT NULL,
  `admin` int(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Data exporting was unselected.

-- Dumping structure for table corestore.fornecedor
CREATE TABLE IF NOT EXISTS `fornecedor` (
  `idFornecedor` int(5) NOT NULL AUTO_INCREMENT,
  `CNPJ` varchar(14) NOT NULL,
  `razaoSocial` varchar(30) NOT NULL,
  `nomeFantasia` varchar(25) DEFAULT NULL,
  `endereco` varchar(30) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `cep` varchar(11) NOT NULL,
  `codigoBanco` int(3) NOT NULL,
  `agencia` int(4) NOT NULL,
  `digitoAgencia` int(1) DEFAULT NULL,
  `numeroConta` int(10) NOT NULL,
  `digitoConta` int(1) NOT NULL,
  PRIMARY KEY (`idFornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Data exporting was unselected.

-- Dumping structure for table corestore.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `idProduto` int(6) NOT NULL AUTO_INCREMENT,
  `quantidade` int(4) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `plataforma` varchar(20) NOT NULL,
  `precoCusto` int(3) NOT NULL,
  `precoVenda` int(3) NOT NULL,
  `empresaCriadora` varchar(40) DEFAULT NULL,
  `faixaEtaria` int(2) DEFAULT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Data exporting was unselected.

-- Dumping structure for table corestore.vendas
CREATE TABLE IF NOT EXISTS `vendas` (
  `idVenda` int(9) NOT NULL AUTO_INCREMENT,
  `produto` varchar(30) NOT NULL,
  `quantidadeVendida` int(4) NOT NULL,
  PRIMARY KEY (`idVenda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Data exporting was unselected.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
