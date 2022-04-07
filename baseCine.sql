-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cine1
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `asiento`
--

DROP TABLE IF EXISTS `asiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asiento` (
  `idasiento` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  `precio` int NOT NULL,
  `asiento_fila` varchar(1) NOT NULL,
  `asiento_num` int NOT NULL,
  PRIMARY KEY (`idasiento`),
  UNIQUE KEY `idasiento_UNIQUE` (`idasiento`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asiento`
--

LOCK TABLES `asiento` WRITE;
/*!40000 ALTER TABLE `asiento` DISABLE KEYS */;
INSERT INTO `asiento` VALUES (1,'general',11000,'A',1),(2,'general',11000,'A',2),(3,'general',11000,'A',3),(4,'general',11000,'A',4),(5,'general',11000,'A',5),(6,'general',11000,'A',6),(7,'general',11000,'A',7),(8,'general',11000,'A',8),(9,'general',11000,'A',9),(10,'general',11000,'A',10),(11,'general',11000,'B',1),(12,'general',11000,'B',2),(13,'general',11000,'B',3),(14,'general',11000,'B',4),(15,'general',11000,'B',5),(16,'general',11000,'B',6),(17,'general',11000,'B',7),(18,'general',11000,'B',8),(19,'general',11000,'B',9),(20,'general',11000,'B',10),(21,'general',11000,'C',1),(22,'general',11000,'C',2),(23,'general',11000,'C',3),(24,'general',11000,'C',4),(25,'general',11000,'C',5),(26,'general',11000,'C',6),(27,'general',11000,'C',7),(28,'general',11000,'C',8),(29,'general',11000,'C',9),(30,'general',11000,'C',10),(31,'general',11000,'D',1),(32,'general',11000,'D',2),(33,'general',11000,'D',3),(34,'general',11000,'D',4),(35,'general',11000,'D',5),(36,'general',11000,'D',6),(37,'general',11000,'D',7),(38,'general',11000,'D',8),(39,'general',11000,'D',9),(40,'general',11000,'D',10),(41,'preferencial',15000,'E',1),(42,'preferencial',15000,'E',2),(43,'preferencial',15000,'E',3),(44,'preferencial',15000,'E',4),(45,'preferencial',15000,'E',5),(46,'preferencial',15000,'E',6),(47,'preferencial',15000,'E',7),(48,'preferencial',15000,'E',8),(49,'preferencial',15000,'E',9),(50,'preferencial',15000,'E',10),(51,'preferencial',15000,'F',1),(52,'preferencial',15000,'F',2),(53,'preferencial',15000,'F',3),(54,'preferencial',15000,'F',4),(55,'preferencial',15000,'F',5),(56,'preferencial',15000,'F',6),(57,'preferencial',15000,'F',7),(58,'preferencial',15000,'F',8),(59,'preferencial',15000,'F',9),(60,'preferencial',15000,'F',10);
/*!40000 ALTER TABLE `asiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calificaciones`
--

DROP TABLE IF EXISTS `calificaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calificaciones` (
  `idtable1` int NOT NULL AUTO_INCREMENT,
  `valoracion` int NOT NULL,
  `multiplex_idmultiplex` int NOT NULL,
  PRIMARY KEY (`idtable1`),
  UNIQUE KEY `idtable1_UNIQUE` (`idtable1`),
  KEY `fk_table1_multiplex1_idx` (`multiplex_idmultiplex`),
  CONSTRAINT `fk_table1_multiplex1` FOREIGN KEY (`multiplex_idmultiplex`) REFERENCES `multiplex` (`idmultiplex`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calificaciones`
--

LOCK TABLES `calificaciones` WRITE;
/*!40000 ALTER TABLE `calificaciones` DISABLE KEYS */;
INSERT INTO `calificaciones` VALUES (1,4,1),(2,1,1),(3,3,1),(4,1,1);
/*!40000 ALTER TABLE `calificaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `doc` int NOT NULL,
  `correo` varchar(50) NOT NULL,
  `puntos` int DEFAULT NULL,
  `contraseña` varchar(12) DEFAULT NULL,
  `tipo_doc_idtipo_doc` int NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE KEY `idCliente_UNIQUE` (`idCliente`),
  UNIQUE KEY `doc_UNIQUE` (`doc`),
  KEY `fk_cliente_tipo_doc1_idx` (`tipo_doc_idtipo_doc`),
  CONSTRAINT `fk_cliente_tipo_doc1` FOREIGN KEY (`tipo_doc_idtipo_doc`) REFERENCES `tipo_doc` (`idtipo_doc`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'andrew',1000706695,'algo@gmail.com',200,'asdsdad',1),(2,'ventas en multiplex',0,'\"\"',0,'\"\"',1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `despacho`
--

DROP TABLE IF EXISTS `despacho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `despacho` (
  `idDespacho` int NOT NULL AUTO_INCREMENT,
  `snacks_idSnacks` int NOT NULL,
  `venta_idventa` int NOT NULL,
  PRIMARY KEY (`idDespacho`),
  UNIQUE KEY `idDespacho_UNIQUE` (`idDespacho`),
  KEY `fk_Despacho_snacks1_idx` (`snacks_idSnacks`),
  KEY `fk_Despacho_venta1_idx` (`venta_idventa`),
  CONSTRAINT `fk_Despacho_snacks1` FOREIGN KEY (`snacks_idSnacks`) REFERENCES `snacks` (`idSnacks`),
  CONSTRAINT `fk_Despacho_venta1` FOREIGN KEY (`venta_idventa`) REFERENCES `venta` (`idventa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `despacho`
--

LOCK TABLES `despacho` WRITE;
/*!40000 ALTER TABLE `despacho` DISABLE KEYS */;
/*!40000 ALTER TABLE `despacho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `idEmpleado` int NOT NULL,
  `nombreEmp` varchar(70) NOT NULL,
  `cedula` int NOT NULL,
  `telefono` int NOT NULL,
  `fechaInicio` date NOT NULL,
  `salario` int NOT NULL,
  `rol` varchar(50) NOT NULL,
  `multiplex_idmultiplex` int NOT NULL,
  `passwords` varchar(45) NOT NULL,
  PRIMARY KEY (`idEmpleado`),
  UNIQUE KEY `idEmpleado_UNIQUE` (`idEmpleado`),
  KEY `fk_empleado_multiplex1_idx` (`multiplex_idmultiplex`),
  CONSTRAINT `fk_empleado_multiplex1` FOREIGN KEY (`multiplex_idmultiplex`) REFERENCES `multiplex` (`idmultiplex`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'Daniel',1000765345,123456313,'2022-04-06',1500000,'cajero',1,'alguien123'),(2,'andres',1323343212,534522342,'2022-04-06',1200000,'despachador de comida',2,'qwerty12'),(3,'garcia',1315132135,135135135,'2022-04-06',5000000,'director',3,'qwerty123');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcion`
--

DROP TABLE IF EXISTS `funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcion` (
  `idfuncion` int NOT NULL AUTO_INCREMENT,
  `fecha` datetime NOT NULL,
  `pelicula_idPelicula` int NOT NULL,
  `sala_idsala` int NOT NULL,
  PRIMARY KEY (`idfuncion`),
  UNIQUE KEY `idfuncion_UNIQUE` (`idfuncion`),
  KEY `fk_funcion_pelicula_idx` (`pelicula_idPelicula`),
  KEY `fk_funcion_sala1_idx` (`sala_idsala`),
  CONSTRAINT `fk_funcion_pelicula` FOREIGN KEY (`pelicula_idPelicula`) REFERENCES `pelicula` (`idPelicula`),
  CONSTRAINT `fk_funcion_sala1` FOREIGN KEY (`sala_idsala`) REFERENCES `sala` (`idsala`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcion`
--

LOCK TABLES `funcion` WRITE;
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
INSERT INTO `funcion` VALUES (1,'2022-04-06 09:30:00',1,5),(2,'2022-04-06 13:30:00',2,3),(3,'2022-04-06 15:15:00',3,1),(4,'2022-04-06 17:30:00',4,2),(5,'2022-04-06 09:30:00',5,4),(6,'2022-04-06 20:30:00',1,6),(7,'2022-04-06 21:30:00',2,7),(8,'2022-04-06 09:30:00',3,8),(9,'2022-04-06 12:30:00',4,9),(10,'2022-04-06 15:15:00',5,10),(11,'2022-04-06 13:45:00',1,15),(12,'2022-04-06 14:30:00',2,14),(13,'2022-04-06 17:30:00',3,13),(14,'2022-04-06 19:45:00',4,12),(15,'2022-04-06 21:30:00',5,11),(16,'2022-04-06 09:15:00',1,17),(17,'2022-04-06 12:32:00',2,16),(18,'2022-04-06 15:30:00',3,19),(19,'2022-04-06 12:32:00',4,18),(20,'2022-04-06 19:45:00',5,20),(21,'2022-04-06 07:32:00',1,23),(22,'2022-04-06 15:45:00',2,21),(23,'2022-04-06 17:15:00',3,22),(24,'2022-04-06 13:30:00',4,25),(25,'2022-04-06 14:30:00',5,24),(26,'2022-04-06 15:30:00',1,28),(27,'2022-04-06 12:30:00',2,29),(28,'2022-04-06 17:45:00',3,30),(29,'2022-04-06 11:15:00',4,26),(30,'2022-04-06 12:32:00',5,27),(31,'2022-04-06 12:32:00',1,4),(32,'2022-07-03 12:35:00',1,2);
/*!40000 ALTER TABLE `funcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `multiplex`
--

DROP TABLE IF EXISTS `multiplex`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `multiplex` (
  `idmultiplex` int NOT NULL AUTO_INCREMENT,
  `lugar` varchar(45) NOT NULL,
  PRIMARY KEY (`idmultiplex`),
  UNIQUE KEY `idmultiplex_UNIQUE` (`idmultiplex`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `multiplex`
--

LOCK TABLES `multiplex` WRITE;
/*!40000 ALTER TABLE `multiplex` DISABLE KEYS */;
INSERT INTO `multiplex` VALUES (1,'Titán'),(2,'Unicentro'),(3,'Plaza Central'),(4,'Gran Estación'),(5,'Embajador (centro)'),(6,'Las Américas');
/*!40000 ALTER TABLE `multiplex` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pelicula`
--

DROP TABLE IF EXISTS `pelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelicula` (
  `idPelicula` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `duracion` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `año` varchar(45) NOT NULL,
  `sinopsis` varchar(510) NOT NULL,
  PRIMARY KEY (`idPelicula`),
  UNIQUE KEY `idPelicula_UNIQUE` (`idPelicula`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula`
--

LOCK TABLES `pelicula` WRITE;
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` VALUES (1,'THE BATMAN','176','suspenso, crimen, superheroes','2022','En el segundo año de su lucha contra el crimen, Batman investiga la corrupción que recorre Gotham City y cómo conduce hasta su propia familia, mientras se enfrenta a un asesino conocido como Enigma.'),(2,'UNCHARTED','116','Aventura, Fantasia, Accion','2022','Nathan Drake y su compañero Victor Sullivan se adentran en la peligrosa búsqueda del \"mayor tesoro jamás encontrado” mismo tiempo, rastrean pistas que puedan conducir al hermano perdido de Drake.'),(3,'MORBIUS','104','terror, suspenso, superheroes','2022','Ambientada en el universo de Spider Man, se centra en uno de sus villanos más icónicos, Morbius, un doctor que tras sufrir una enfermedad en la sangre y fallar al intentar curarse, se convirtió en un vampiro.'),(4,'SONIC 2','122','comedia, accion y aventura','2022','Después de establecerse en Green Hills, Sonic se muere por demostrar que tiene madera de auténtico héroe. La prueba de fuego llega con el retorno del malvado Robotnik, en esta ocasión con un nuevo compinche, Knuckles, en busca de una esmeralda que tiene el poder de destruir civilizaciones. Sonic forma equipo con su propio compañero de fatigas, Tails, y juntos se lanzan a una aventura que les llevará por todo el mundo en busca de la preciada piedra para evitar que caiga en manos equivocadas.'),(5,'ENCANTO','109','comedia, musical, fantasia','2021','En lo alto de las montañas de Colombia hay un lugar encantado llamado Encanto. Aquí, en una casa mágica, vive la extraordinaria familia Madrigal donde todos tienen habilidades fantásticas.');
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala`
--

DROP TABLE IF EXISTS `sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala` (
  `idsala` int NOT NULL AUTO_INCREMENT,
  `numero` varchar(45) NOT NULL,
  `multiplex_idmultiplex` int NOT NULL,
  PRIMARY KEY (`idsala`),
  UNIQUE KEY `idsala_UNIQUE` (`idsala`),
  KEY `fk_sala_multiplex1_idx` (`multiplex_idmultiplex`),
  CONSTRAINT `fk_sala_multiplex1` FOREIGN KEY (`multiplex_idmultiplex`) REFERENCES `multiplex` (`idmultiplex`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala`
--

LOCK TABLES `sala` WRITE;
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` VALUES (1,'1',1),(2,'2',1),(3,'3',1),(4,'4',1),(5,'5',1),(6,'1',2),(7,'2',2),(8,'3',2),(9,'4',2),(10,'5',2),(11,'1',3),(12,'2',3),(13,'3',3),(14,'4',3),(15,'5',3),(16,'1',4),(17,'2',4),(18,'3',4),(19,'4',4),(20,'5',4),(21,'1',5),(22,'2',5),(23,'3',5),(24,'4',5),(25,'5',5),(26,'1',6),(27,'2',6),(28,'3',6),(29,'4',6),(30,'5',6);
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `snacks`
--

DROP TABLE IF EXISTS `snacks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `snacks` (
  `idSnacks` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `precio` varchar(20) NOT NULL,
  `tamaño` varchar(20) NOT NULL,
  PRIMARY KEY (`idSnacks`),
  UNIQUE KEY `idSnacks_UNIQUE` (`idSnacks`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `snacks`
--

LOCK TABLES `snacks` WRITE;
/*!40000 ALTER TABLE `snacks` DISABLE KEYS */;
/*!40000 ALTER TABLE `snacks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `idticket` int NOT NULL AUTO_INCREMENT,
  `asiento_idasiento` int NOT NULL,
  `funcion_idfuncion` int NOT NULL,
  `venta_idventa` int NOT NULL,
  PRIMARY KEY (`idticket`),
  UNIQUE KEY `idticket_UNIQUE` (`idticket`),
  KEY `fk_ticket_asiento1_idx` (`asiento_idasiento`),
  KEY `fk_ticket_funcion1_idx` (`funcion_idfuncion`),
  KEY `fk_ticket_venta1_idx` (`venta_idventa`),
  CONSTRAINT `fk_ticket_asiento1` FOREIGN KEY (`asiento_idasiento`) REFERENCES `asiento` (`idasiento`),
  CONSTRAINT `fk_ticket_funcion1` FOREIGN KEY (`funcion_idfuncion`) REFERENCES `funcion` (`idfuncion`),
  CONSTRAINT `fk_ticket_venta1` FOREIGN KEY (`venta_idventa`) REFERENCES `venta` (`idventa`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,35,32,1),(2,45,32,1),(3,50,32,1),(4,15,32,1),(5,5,32,1),(10,46,32,11),(11,56,32,11),(12,25,32,11),(15,42,32,13),(16,52,32,13),(17,23,32,14),(18,33,32,14),(19,3,32,15),(20,13,32,15),(21,10,32,16),(22,20,32,16),(23,1,32,17),(24,2,32,17),(25,1,32,18),(26,2,32,18),(27,7,32,18),(28,8,32,18);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_doc`
--

DROP TABLE IF EXISTS `tipo_doc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_doc` (
  `idtipo_doc` int NOT NULL AUTO_INCREMENT,
  `tipo_doc_nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtipo_doc`),
  UNIQUE KEY `idtipo_doc_UNIQUE` (`idtipo_doc`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_doc`
--

LOCK TABLES `tipo_doc` WRITE;
/*!40000 ALTER TABLE `tipo_doc` DISABLE KEYS */;
INSERT INTO `tipo_doc` VALUES (1,'cedula ciudadania'),(2,'tarjeta identidad');
/*!40000 ALTER TABLE `tipo_doc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `idventa` int NOT NULL AUTO_INCREMENT,
  `medio_pago` varchar(45) NOT NULL,
  `cliente_idCliente` int NOT NULL,
  `fecha` datetime NOT NULL,
  PRIMARY KEY (`idventa`),
  UNIQUE KEY `idventa_UNIQUE` (`idventa`),
  KEY `fk_venta_cliente1_idx` (`cliente_idCliente`),
  CONSTRAINT `fk_venta_cliente1` FOREIGN KEY (`cliente_idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,'efectiva',1,'2022-04-06 00:00:00'),(11,'pago Virtual',1,'2022-04-06 20:13:00'),(12,'pago Virtual',1,'2022-04-06 20:14:00'),(13,'pago Virtual',1,'2022-04-06 20:17:00'),(14,'pago Virtual',1,'2022-04-06 20:18:00'),(15,'pago en el multiplex',2,'2022-04-06 20:40:00'),(16,'pago en el multiplex',1,'2022-04-06 20:41:00'),(17,'pago Virtual',1,'2022-04-06 21:43:00'),(18,'pago en el multiplex',1,'2022-04-06 21:45:00');
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-06 22:31:21
