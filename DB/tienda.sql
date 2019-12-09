-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 11-05-2013 a las 15:48:14
-- Versión del servidor: 5.5.16
-- Versión de PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

CREATE TABLE IF NOT EXISTS `boleta` (
  `num_bol` varchar(8) NOT NULL,
  `cod_cli` varchar(6) NOT NULL,
  `pre_tot` varchar(10) NOT NULL,
  `fecha` varchar(15) NOT NULL,
  PRIMARY KEY (`num_bol`),
  KEY `cod_cli` (`cod_cli`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `cod_cli` varchar(6) NOT NULL,
  `nom_cli` varchar(30) NOT NULL,
  `ape_cli` varchar(30) NOT NULL,
  `sexo_cli` varchar(15) NOT NULL,
  `dni_cli` varchar(8) NOT NULL,
  `tel_cli` varchar(9) NOT NULL,
  `ruc_cli` varchar(11) NOT NULL,
  `email_cli` varchar(30) NOT NULL,
  `dir_cli` varchar(30) NOT NULL,
  PRIMARY KEY (`cod_cli`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `cod_usu` varchar(6) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `domicilio` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(12) NOT NULL,
  `tipo_usu` VARCHAR(15) NOT NULL,
  `usuario` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod_usu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleboleta`
--

CREATE TABLE IF NOT EXISTS `detalleboleta` (
  `num_bol` varchar(10) NOT NULL,
  `cod_pro` varchar(6) NOT NULL,
  `des_pro` varchar(30) NOT NULL,
  `cant_pro` varchar(3) NOT NULL,
  `pre_unit` varchar(10) NOT NULL,
  `pre_venta` varchar(10) NOT NULL,
  KEY `num_bol` (`num_bol`),
  KEY `cod_pro` (`cod_pro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallefactura`
--

CREATE TABLE IF NOT EXISTS `detallefactura` (
  `num_fac` varchar(10) NOT NULL,
  `cod_pro` varchar(6) NOT NULL,
  `des_pro` varchar(30) NOT NULL,
  `cant_pro` varchar(3) NOT NULL,
  `pre_unit` varchar(10) NOT NULL,
  `pre_tot` varchar(10) NOT NULL,
  KEY `num_fac` (`num_fac`),
  KEY `cod_pro` (`cod_pro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
  `num_fac` varchar(8) NOT NULL,
  `cod_cli` varchar(6) NOT NULL,
  `ruc_cli` varchar(11) NOT NULL,
  `subtotal` varchar(10) NOT NULL,
  `igv` varchar(40) NOT NULL,
  `total` varchar(20) NOT NULL,
  `fec_fac` varchar(20) NOT NULL,
  PRIMARY KEY (`num_fac`),
  KEY `cod_cli` (`cod_cli`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `cod_pro` varchar(6) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precio` varchar(10) NOT NULL,
  `Stock` varchar(10) NOT NULL,
  PRIMARY KEY (`cod_pro`,`descripcion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD CONSTRAINT `boleta_ibfk_1` FOREIGN KEY (`cod_cli`) REFERENCES `cliente` (`cod_cli`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalleboleta`
--
ALTER TABLE `detalleboleta`
  ADD CONSTRAINT `detalleboleta_ibfk_1` FOREIGN KEY (`num_bol`) REFERENCES `boleta` (`num_bol`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalleboleta_ibfk_2` FOREIGN KEY (`cod_pro`) REFERENCES `producto` (`cod_pro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detallefactura`
--
ALTER TABLE `detallefactura`
  ADD CONSTRAINT `detallefactura_ibfk_1` FOREIGN KEY (`num_fac`) REFERENCES `factura` (`num_fac`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detallefactura_ibfk_2` FOREIGN KEY (`cod_pro`) REFERENCES `producto` (`cod_pro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`cod_cli`) REFERENCES `cliente` (`cod_cli`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



INSERT INTO `usuario` (`cod_usu`,`nombre`,`domicilio`,`telefono`,`tipo_usu`,`usuario`,`contraseña`) VALUES ('CU0001','Luis','Paita','963937661','Administrador','Admin','123456');
INSERT INTO `usuario` (`cod_usu`,`nombre`,`domicilio`,`telefono`,`tipo_usu`,`usuario`,`contraseña`) VALUES ('CU0002','Liliana','Pueblo Nuevo','123456789','Administrador','Admin2','123456');
INSERT INTO `usuario` (`cod_usu`,`nombre`,`domicilio`,`telefono`,`tipo_usu`,`usuario`,`contraseña`) VALUES ('CU0003','Carlos','Lima','978645321','Usuario','Carlos3','carlos123');

INSERT INTO `cliente` (`cod_cli`,`nom_cli`,`ape_cli`,`sexo_cli`,`dni_cli`,`tel_cli`,`ruc_cli`,`email_cli`,`dir_cli`) VALUES ('CC0001','Pedrito','Sanchez','Masculino','87654321','987654321','10876543219','Pedrito_Ramirez@gmail.com','Paita');
INSERT INTO `cliente` (`cod_cli`,`nom_cli`,`ape_cli`,`sexo_cli`,`dni_cli`,`tel_cli`,`ruc_cli`,`email_cli`,`dir_cli`) VALUES ('CC0002','Maria','Lopez','Femenino','01234567','987654321','10012345679','Maria.Lopez10@gmail.com','Sullana');
INSERT INTO `cliente` (`cod_cli`,`nom_cli`,`ape_cli`,`sexo_cli`,`dni_cli`,`tel_cli`,`ruc_cli`,`email_cli`,`dir_cli`) VALUES ('CC0003','Juana','Rodrigez','Femenino','87564123','985764231','10875641235','juana520185@gmail.com','Paita');
INSERT INTO `cliente` (`cod_cli`,`nom_cli`,`ape_cli`,`sexo_cli`,`dni_cli`,`tel_cli`,`ruc_cli`,`email_cli`,`dir_cli`) VALUES ('CC0004','Francisco','Campos','Masculino','75642318','946578213','10756423188','francisco01campos@gmail.com','Tamarindo');

INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000001','CC0002','12345678','11590.0','2086.2','13676.2','04/12/2019');
INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000002','CC0001','87654321','18295.0','3293.1','21588.1','04/12/2019');
INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000003','CC0002','12345678','5798.0','1043.64','6841.64','06/12/2019');
INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000004','CC0003','1234056789','44280.0','7970.4','52250.4','07/12/2019');
INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000005','CC0002','9876543210','38295.0','6893.1','45188.1','07/12/2019');
INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000006','CC0003','1234056789','273910.0','49303.8','323213.8','07/12/2019');
INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000007','CC0003','1234056789','48536.0','8736.48','57272.48','08/12/2019');
INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000008','CC0002','9876543210','123789.0','22282.02','146071.02','08/12/2019');
INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000009','CC0003','1234056789','2500.0','450.0','2950.0','08/12/2019');
INSERT INTO `factura` (`num_fac`,`cod_cli`,`ruc_cli`,`subtotal`,`igv`,`total`,`fec_fac`) VALUES ('00000010','CC0004','10756423188','4576.0','823.68','5399.68','08/12/2019');

INSERT INTO `boleta` (`num_bol`,`cod_cli`,`pre_tot`,`fecha`) VALUES ('00000001','CC0001','7500.0','04/12/2019');
INSERT INTO `boleta` (`num_bol`,`cod_cli`,`pre_tot`,`fecha`) VALUES ('00000002','CC0002','4090.0','04/12/2019');
INSERT INTO `boleta` (`num_bol`,`cod_cli`,`pre_tot`,`fecha`) VALUES ('00000003','CC0001','22787.0','06/12/2019');
INSERT INTO `boleta` (`num_bol`,`cod_cli`,`pre_tot`,`fecha`) VALUES ('00000004','CC0003','15000.0','07/12/2019');
INSERT INTO `boleta` (`num_bol`,`cod_cli`,`pre_tot`,`fecha`) VALUES ('00000005','CC0001','1590.0','07/12/2019');
INSERT INTO `boleta` (`num_bol`,`cod_cli`,`pre_tot`,`fecha`) VALUES ('00000006','CC0003','2500.0','08/12/2019');

INSERT INTO `producto` (`cod_pro`,`descripcion`,`precio`,`Stock`) VALUES ('CP0004','Monitor','159','816');
INSERT INTO `producto` (`cod_pro`,`descripcion`,`precio`,`Stock`) VALUES ('CP0005','Laptop','2500','393');
INSERT INTO `producto` (`cod_pro`,`descripcion`,`precio`,`Stock`) VALUES ('CP0006','Pc','2899','2445');
INSERT INTO `producto` (`cod_pro`,`descripcion`,`precio`,`Stock`) VALUES ('CP0007','Celular Huawei Y7 2020','1200','49');

INSERT INTO `detalleboleta` (`num_bol`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_venta`) VALUES ('00000001','CP0005','Laptop','3','2500','7500.0');
INSERT INTO `detalleboleta` (`num_bol`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_venta`) VALUES ('00000002','CP0004','Monitor','10','159','1590.0');
INSERT INTO `detalleboleta` (`num_bol`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_venta`) VALUES ('00000002','CP0005','Laptop','1','2500','2500.0');
INSERT INTO `detalleboleta` (`num_bol`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_venta`) VALUES ('00000003','CP0005','Laptop','5','2500','12500.0');
INSERT INTO `detalleboleta` (`num_bol`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_venta`) VALUES ('00000003','CP0006','Pc','3','2899','8697.0');
INSERT INTO `detalleboleta` (`num_bol`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_venta`) VALUES ('00000003','CP0004','Monitor','10','159','1590.0');
INSERT INTO `detalleboleta` (`num_bol`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_venta`) VALUES ('00000004','CP0005','Laptop','6','2500','15000.0');
INSERT INTO `detalleboleta` (`num_bol`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_venta`) VALUES ('00000005','CP0004','Monitor','10','159','1590.0');
INSERT INTO `detalleboleta` (`num_bol`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_venta`) VALUES ('00000006','CP0005','Laptop','1','2500','2500.0');

INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000001','CP0005','Laptop','4','2500','10000.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000001','CP0004','Monitor','10','159','1590.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000002','CP0004','Monitor','5','159','795.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000002','CP0005','Laptop','7','2500','17500.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000003','CP0006','Pc','2','2899','5798.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000004','CP0006','Pc','15','2899','43485.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000004','CP0004','Monitor','5','159','795.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000005','CP0004','Monitor','5','159','795.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000005','CP0005','Laptop','15','2500','37500.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000006','CP0004','Monitor','50','159','7950.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000006','CP0006','Pc','40','2899','115960.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000006','CP0005','Laptop','60','2500','150000.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000007','CP0004','Monitor','50','159','7950.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000007','CP0006','Pc','14','2899','40586.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000008','CP0005','Laptop','45','2500','112500.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000008','CP0004','Monitor','71','159','11289.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000009','CP0005','Laptop','1','2500','2500.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000010','CP0007','Celular Huawei Y7 2020','1','1200','1200.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000010','CP0004','Monitor','3','159','477.0');
INSERT INTO `detallefactura` (`num_fac`,`cod_pro`,`des_pro`,`cant_pro`,`pre_unit`,`pre_tot`) VALUES ('00000010','CP0006','Pc','1','2899','2899.0');



