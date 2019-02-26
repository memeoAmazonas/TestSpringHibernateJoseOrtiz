-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 26-02-2019 a las 01:28:53
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `testSpring`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Alumno`
--

CREATE TABLE `Alumno` (
  `idAlumno` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fechaNacimiento` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Alumno`
--

INSERT INTO `Alumno` (`idAlumno`, `nombre`, `apellido`, `direccion`, `fechaNacimiento`) VALUES
(1, 'juan', 'gonzales', 'caracas', '06/12/1983'),
(2, 'Alejandro', 'fernandez', 'caracas', '06/12/1983'),
(3, 'Pedro', 'alcantara', 'caracas', '06/12/1983'),
(4, 'Luis', 'perez', 'caracas', '06/12/1983'),
(5, 'Andres', 'peleaez', 'caracas', '06/12/1983');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Curso`
--

CREATE TABLE `Curso` (
  `idCurso` bigint(20) NOT NULL,
  `nombreCurso` varchar(255) DEFAULT NULL,
  `horasDictadas` int(11) DEFAULT NULL,
  `profesor` varchar(255) DEFAULT NULL,
  `nota` int(11) DEFAULT NULL,
  `cantidadAsistencia` int(11) DEFAULT NULL,
  `idAlumno` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Curso`
--

INSERT INTO `Curso` (`idCurso`, `nombreCurso`, `horasDictadas`, `profesor`, `nota`, `cantidadAsistencia`, `idAlumno`) VALUES
(1, 'curso4', 50, 'prof4', 6, 6, 1),
(2, 'curso2', 30, 'prof2', 4, 4, 1),
(3, 'curso3', 40, 'prof3', 5, 5, 1),
(4, 'curso1', 20, 'prof1', 3, 3, 1),
(5, 'curso3', 40, 'prof3', 51, 5, 2),
(6, 'curso4', 50, 'prof4', 61, 6, 2),
(7, 'calculo numerico', 20, 'prof1', 131, 3, 2),
(8, 'curso2', 30, 'prof2', 41, 14, 2),
(9, 'curso3', 40, 'prof3', 51, 5, 3),
(10, 'calculo numerico', 20, 'prof1', 311, 13, 3),
(11, 'curso4', 50, 'prof4', 61, 6, 3),
(12, 'curso2', 30, 'prof2', 41, 4, 3),
(13, 'curso3', 40, 'prof3', 51, 5, 4),
(14, 'calculo numerico', 20, 'prof1', 310, 19, 4),
(15, 'curso4', 50, 'prof4', 61, 6, 4),
(16, 'curso2', 30, 'prof2', 41, 4, 4),
(17, 'curso3', 40, 'prof3', 51, 5, 5),
(18, 'curso4', 50, 'prof4', 61, 6, 5),
(19, 'calculo numerico', 20, 'prof1', 31, 1, 5),
(20, 'curso2', 30, 'prof2', 41, 4, 5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Alumno`
--
ALTER TABLE `Alumno`
  ADD PRIMARY KEY (`idAlumno`);

--
-- Indices de la tabla `Curso`
--
ALTER TABLE `Curso`
  ADD PRIMARY KEY (`idCurso`),
  ADD KEY `FKki9y8lc2bugfh2hceosb0too6` (`idAlumno`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Alumno`
--
ALTER TABLE `Alumno`
  MODIFY `idAlumno` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `Curso`
--
ALTER TABLE `Curso`
  MODIFY `idCurso` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
