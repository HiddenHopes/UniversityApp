-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: managerdb
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `bazaar_list`
--

DROP TABLE IF EXISTS `bazaar_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bazaar_list` (
  `item` varchar(45) NOT NULL,
  `cost` varchar(45) NOT NULL,
  `bazaar_man` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bazaar_list`
--

LOCK TABLES `bazaar_list` WRITE;
/*!40000 ALTER TABLE `bazaar_list` DISABLE KEYS */;
INSERT INTO `bazaar_list` VALUES ('Murgi','600','Aryan','Jun 2, 2022'),('Fish','200','Hridoy','Jun 3, 2022'),('Alu ','30','Shovon','Jun 4, 2022'),('Potol','60','Ismail','Jun 5, 2022'),('Onion','60','Shajjad','Jun 6, 2022'),('Oil','520','Shajjad','Jun 6, 2022'),('Kacha Bazaar','180','Akib','Jun 7, 2022'),('Murgi','400','Akib','Jun 7, 2022'),('Dhaal','120','Hridoy','Jun 7, 2022'),('Fish','700','Tanveer','Jun 13, 2022'),('Meat','1000','Aryan','Jun 17, 2022'),('Rice','2380','Farhan','Jun 17, 2022'),('Onion','100','Ifti','Jun 16, 2022'),('murgi','100','shaad','Jun 23, 2022');
/*!40000 ALTER TABLE `bazaar_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meal_entry`
--

DROP TABLE IF EXISTS `meal_entry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meal_entry` (
  `name` varchar(45) NOT NULL,
  `1` varchar(45) DEFAULT NULL,
  `2` varchar(45) DEFAULT NULL,
  `3` varchar(45) DEFAULT NULL,
  `4` varchar(45) DEFAULT NULL,
  `5` varchar(45) DEFAULT NULL,
  `6` varchar(45) DEFAULT NULL,
  `7` varchar(45) DEFAULT NULL,
  `8` varchar(45) DEFAULT NULL,
  `9` varchar(45) DEFAULT NULL,
  `10` varchar(45) DEFAULT NULL,
  `11` varchar(45) DEFAULT NULL,
  `12` varchar(45) DEFAULT NULL,
  `13` varchar(45) DEFAULT NULL,
  `14` varchar(45) DEFAULT NULL,
  `15` varchar(45) DEFAULT NULL,
  `16` varchar(45) DEFAULT NULL,
  `17` varchar(45) DEFAULT NULL,
  `18` varchar(45) DEFAULT NULL,
  `19` varchar(45) DEFAULT NULL,
  `20` varchar(45) DEFAULT NULL,
  `21` varchar(45) DEFAULT NULL,
  `22` varchar(45) DEFAULT NULL,
  `23` varchar(45) DEFAULT NULL,
  `24` varchar(45) DEFAULT NULL,
  `25` varchar(45) DEFAULT NULL,
  `26` varchar(45) DEFAULT NULL,
  `27` varchar(45) DEFAULT NULL,
  `28` varchar(45) DEFAULT NULL,
  `29` varchar(45) DEFAULT NULL,
  `30` varchar(45) DEFAULT NULL,
  `31` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  `serial` varchar(45) NOT NULL,
  PRIMARY KEY (`serial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meal_entry`
--

LOCK TABLES `meal_entry` WRITE;
/*!40000 ALTER TABLE `meal_entry` DISABLE KEYS */;
INSERT INTO `meal_entry` VALUES ('Akib','3','3','3','2.5','3','3','3','3','3','3','3','3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1'),('Siam','0','3','3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'10'),('Supto',NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'11'),('Shariar',NULL,NULL,'3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'12'),('Farhan',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'13'),('Hridoy','3','0','3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2'),('Shajjad','3','3','3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'3'),('Ismail','3','3','3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'4'),('Alvi','3','0','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'5'),('Ayon','3','3','3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'6'),('Tanveer','3','3','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'7'),('Jayed','3','0','3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'8'),('Aryan','0','0','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'9');
/*!40000 ALTER TABLE `meal_entry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `money_manager`
--

DROP TABLE IF EXISTS `money_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `money_manager` (
  `name` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `money_manager`
--

LOCK TABLES `money_manager` WRITE;
/*!40000 ALTER TABLE `money_manager` DISABLE KEYS */;
INSERT INTO `money_manager` VALUES ('Akib','3000','Jun 1, 2022'),('Aryan','2000','Jun 9, 2022'),('Ayon','3000','Jun 2, 2022'),('Hridoy','1000','Jun 11, 2022'),('Ifti','1500','Jun 2, 2022'),('Ismail','1500','Jun 15, 2022'),('Siam','500','Jun 2, 2022'),('Tanveer','2800','Jun 3, 2022'),('Taskin','1800','Jun 3, 2022');
/*!40000 ALTER TABLE `money_manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule_table`
--

DROP TABLE IF EXISTS `schedule_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule_table` (
  `Serial` varchar(45) NOT NULL,
  `DAY` varchar(45) NOT NULL,
  `BREAKFAST` varchar(45) DEFAULT NULL,
  `LUNCH` varchar(45) DEFAULT NULL,
  `DINNER` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Serial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule_table`
--

LOCK TABLES `schedule_table` WRITE;
/*!40000 ALTER TABLE `schedule_table` DISABLE KEYS */;
INSERT INTO `schedule_table` VALUES ('1','Saturday','Borta','Chicken ','Vegetable'),('2','Sunday','khichuri','vegetable','Egg'),('3','Monday','Egg','Vegetable','Beef'),('4','Tuesday','Borta','Fish','Vegetable'),('5','Wednesday','Dhaal','Beef','Fish'),('6','Thursday','Egg','Chicken','Fish'),('7','Friday','Khichuri','Kacci','Biriyani');
/*!40000 ALTER TABLE `schedule_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_login`
--

DROP TABLE IF EXISTS `user_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_login` (
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `number` varchar(45) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_login`
--

LOCK TABLES `user_login` WRITE;
/*!40000 ALTER TABLE `user_login` DISABLE KEYS */;
INSERT INTO `user_login` VALUES ('a','a','a','a'),('Muntasir Akib','akib08@gmail.com','','01701741656'),('Asif Mahmud','ayon@gmail.com','','01345654565'),('Mr. bean','bean@gmail.com','','01978666555'),('Hridoy Hossain','hridoy@gmail.com','','01678666999'),('MD Ismail','ismail35@gmail.com','','01834567865'),('Shaad Shajjad','shaad@gmail.com','','01763258642'),('Tanveer Alam','tanveer@gmail.com','','01678666998'),('Taskin Ahmed','taskin@gmail.com','speed','018133012922'),('Tatfif Aryan','tatfif@gmail.com','','01765656543');
/*!40000 ALTER TABLE `user_login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-27  0:42:08
