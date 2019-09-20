-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dbeventos
-- -----------------------------------------------------
drop database if exists dbeventos;
-- -----------------------------------------------------
-- Schema dbeventos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbeventos` DEFAULT CHARACTER SET utf8 ;
USE `dbeventos` ;

-- -----------------------------------------------------
-- Table `dbeventos`.`area`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`area` (
  `idarea` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idarea`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`lugarevento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`lugarevento` (
  `idlugarevento` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `Area_idArea` INT NOT NULL,
  PRIMARY KEY (`idlugarevento`),
  INDEX `fk_lugarevento_Area1_idx` (`Area_idArea` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`evento` (
  `idevento` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idevento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`cotizaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`cotizaciones` (
  `idcotizaciones` INT NOT NULL AUTO_INCREMENT,
  `nombrecotizacion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcotizaciones`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`cliente` (
  `idcliente` INT NOT NULL AUTO_INCREMENT,
  `nombres` VARCHAR(100) NOT NULL,
  `apellidos` VARCHAR(100) NOT NULL,
  `telefono` INT NOT NULL,
  `correro` VARCHAR(100) NULL,
  PRIMARY KEY (`idcliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`reservacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`reservacion` (
  `idreservacion` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `horainicio` DATETIME NOT NULL,
  `horafin` DATETIME NOT NULL,
  `descripcion` VARCHAR(100) NOT NULL,
  `lugarEvento_idlugarEvento` INT NOT NULL,
  `area_idarea` INT NOT NULL,
  `evento_idevento` INT NOT NULL,
  `cotizacion_idcotizacion` INT NOT NULL,
  `cliente_idcliente` INT NOT NULL,
  PRIMARY KEY (`idreservacion`),
  INDEX `fk_reservacion_lugarEvento1_idx` (`lugarEvento_idlugarEvento` ASC),
  INDEX `fk_reservacion_area1_idx` (`area_idarea` ASC),
  INDEX `fk_reservacion_evento1_idx` (`evento_idevento` ASC),
  INDEX `fk_reservacion_cotizacion1_idx` (`cotizacion_idcotizacion` ASC),
  INDEX `fk_reservacion_cliente1_idx` (`cliente_idcliente` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`tipoproducto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`tipoproducto` (
  `idtipoproducto` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtipoproducto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`alimentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`alimentos` (
  `idalimentos` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `precioventa` DOUBLE NOT NULL,
  `fechavencimiento` VARCHAR(45) NOT NULL,
  `tipoproducto_idtipoproducto` INT NOT NULL,
  PRIMARY KEY (`idalimentos`),
  INDEX `fk_productos_tipoproducto1_idx` (`tipoproducto_idtipoproducto` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`facturacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`facturacion` (
  `idfacturacion` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `nombrefactura` DATETIME NOT NULL,
  `total` DOUBLE NOT NULL,
  `productos_idproductos` INT NOT NULL,
  `cotizaciones_idcotizaciones` INT NOT NULL,
  PRIMARY KEY (`idfacturacion`),
  INDEX `fk_facturacion_cotizacion1_idx` (`cotizaciones_idcotizaciones` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`detallefacturacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`detallefacturacion` (
  `iddetallefacturacion` INT NOT NULL AUTO_INCREMENT,
  `alimentos_idalimentos` INT NOT NULL,
  `cantidad` VARCHAR(45) NOT NULL,
  `preciove` DOUBLE NOT NULL,
  `facturacion_idfacturacion` INT NOT NULL,
  PRIMARY KEY (`iddetallefacturacion`),
  INDEX `fk_detallefacturacion_productos1_idx` (`alimentos_idalimentos` ASC),
  INDEX `fk_detallefacturacion_facturacion1_idx` (`facturacion_idfacturacion` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbeventos`.`detallecotizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbeventos`.`detallecotizacion` (
  `iddetallecotizacion` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `cantidad` VARCHAR(45) NOT NULL,
  `precioventa` VARCHAR(45) NOT NULL,
  `alimentos_idalimentos` INT NOT NULL,
  `cotizacion_idcotizacion` INT NOT NULL,
  PRIMARY KEY (`iddetallecotizacion`),
  INDEX `fk_detallecotizacion_productos1_idx` (`alimentos_idalimentos` ASC),
  INDEX `fk_detallecotizacion_cotizacion1_idx` (`cotizacion_idcotizacion` ASC))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
