CREATE DATABASE  IF NOT EXISTS `bd_pema` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bd_pema`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_pema
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_productos`
--

DROP TABLE IF EXISTS `tb_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_productos` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `codigoProducto` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `um` varchar(5) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  PRIMARY KEY (`idProducto`,`codigoProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_productos`
--

LOCK TABLES `tb_productos` WRITE;
/*!40000 ALTER TABLE `tb_productos` DISABLE KEYS */;
INSERT INTO `tb_productos` VALUES (1,'costilla1','Costilla de res','LB','Carne'),(2,'costilla2','Costilla de cerdo deliciosa','LB','Carne');
/*!40000 ALTER TABLE `tb_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_productosdisponibles`
--

DROP TABLE IF EXISTS `tb_productosdisponibles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_productosdisponibles` (
  `codigoProducto` int NOT NULL,
  `cantidadRecibido` float NOT NULL,
  `cantidadVenta` float NOT NULL,
  `cantidadDisponible` float NOT NULL,
  PRIMARY KEY (`codigoProducto`),
  KEY `fk_productosDisponibles_productos_idx` (`codigoProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_productosdisponibles`
--

LOCK TABLES `tb_productosdisponibles` WRITE;
/*!40000 ALTER TABLE `tb_productosdisponibles` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_productosdisponibles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_productosingresados`
--

DROP TABLE IF EXISTS `tb_productosingresados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_productosingresados` (
  `idIngreso` int NOT NULL,
  `codigoProducto` varchar(100) NOT NULL,
  `cantidad` float NOT NULL,
  `costoUnit` float NOT NULL,
  `costoTotal` float NOT NULL,
  `proveedor` varchar(100) NOT NULL,
  `ubicacion` varchar(20) NOT NULL,
  PRIMARY KEY (`idIngreso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_productosingresados`
--

LOCK TABLES `tb_productosingresados` WRITE;
/*!40000 ALTER TABLE `tb_productosingresados` DISABLE KEYS */;
INSERT INTO `tb_productosingresados` VALUES (1,'costilla1',25,3.5,87.5,'Carnes y más','Bodega'),(2,'costilla2',15,3,45,'Carnes y más','Bodega');
/*!40000 ALTER TABLE `tb_productosingresados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_productosvendidos`
--

DROP TABLE IF EXISTS `tb_productosvendidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_productosvendidos` (
  `idVenta` int NOT NULL,
  `codigoProducto` int NOT NULL,
  `cantidad` float NOT NULL,
  `costoUnit` float NOT NULL,
  `costoTotal` float NOT NULL,
  KEY `fk_productosVendidos_ventas_idx` (`idVenta`),
  KEY `fk_productosVendidos_productosDisponibles_idx` (`codigoProducto`),
  CONSTRAINT `fk_productosVendidos_productosDisponibles` FOREIGN KEY (`codigoProducto`) REFERENCES `tb_productosdisponibles` (`codigoProducto`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_productosVendidos_ventas` FOREIGN KEY (`idVenta`) REFERENCES `tb_ventas` (`idVenta`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_productosvendidos`
--

LOCK TABLES `tb_productosvendidos` WRITE;
/*!40000 ALTER TABLE `tb_productosvendidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_productosvendidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_tipovendedor`
--

DROP TABLE IF EXISTS `tb_tipovendedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_tipovendedor` (
  `idUsuario` int NOT NULL,
  `tipoVendedor` varchar(20) NOT NULL,
  PRIMARY KEY (`tipoVendedor`),
  KEY `fk_tipoVendedor_usuarios_idx` (`idUsuario`),
  CONSTRAINT `fk_tipoVendedor_usuarios` FOREIGN KEY (`idUsuario`) REFERENCES `tb_usuarios` (`idUsuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_tipovendedor`
--

LOCK TABLES `tb_tipovendedor` WRITE;
/*!40000 ALTER TABLE `tb_tipovendedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_tipovendedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuarios`
--

DROP TABLE IF EXISTS `tb_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_usuarios` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `contraseña` varchar(100) NOT NULL,
  `cargo` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `codigoUsuario` varchar(100) NOT NULL,
  PRIMARY KEY (`idUsuario`,`codigoUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuarios`
--

LOCK TABLES `tb_usuarios` WRITE;
/*!40000 ALTER TABLE `tb_usuarios` DISABLE KEYS */;
INSERT INTO `tb_usuarios` VALUES (1,'Roberto Mendoza','roberto','Supervisor','Habilitado','rmendoza'),(2,'Katherine Ramirez','katherine','Vendedor','Habilitado','kramirez'),(3,'Gloria Sevilla','gloria','Bodeguero','Habilitado','gsevilla'),(4,'Carlos Saravia','carlos','Vendedor','Desabilitado','csaravia');
/*!40000 ALTER TABLE `tb_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_ventas`
--

DROP TABLE IF EXISTS `tb_ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_ventas` (
  `idVenta` int NOT NULL AUTO_INCREMENT,
  `nombreCliente` varchar(45) NOT NULL,
  `idProducto` int NOT NULL,
  `cantidadVenta` double NOT NULL,
  `costoVenta` double NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `fk_ventas_usuarios_idx` (`idUsuario`),
  CONSTRAINT `fk_ventas_usuarios` FOREIGN KEY (`idUsuario`) REFERENCES `tb_usuarios` (`idUsuario`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_ventas`
--

LOCK TABLES `tb_ventas` WRITE;
/*!40000 ALTER TABLE `tb_ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bd_pema'
--

--
-- Dumping routines for database 'bd_pema'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-10  0:03:49
