-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-11-2022 a las 07:36:34
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `formain`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brand_prod`
--

CREATE TABLE `brand_prod` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `brand_prod`
--

INSERT INTO `brand_prod` (`id`, `nombre`) VALUES
(2, 'Samsung');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_prod`
--

CREATE TABLE `cat_prod` (
  `id` int(30) NOT NULL,
  `nombre` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cat_prod`
--

INSERT INTO `cat_prod` (`id`, `nombre`) VALUES
(20, 'Celulares');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clients`
--

CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `nit` varchar(15) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clients`
--

INSERT INTO `clients` (`id`, `nombre`, `nit`, `direccion`, `telefono`) VALUES
(1, 'Esdras Abel Sapon', '32121211', 'Mazatenango', '59391389'),
(6, 'Carlos Humberto Motta', '3212111', 'Mazatenango', '52312111'),
(7, 'Marcos Addiel', '3212-k', 'Quetzaltenango', '52323211');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `measure_prod`
--

CREATE TABLE `measure_prod` (
  `id` int(11) NOT NULL,
  `measure` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `measure_prod`
--

INSERT INTO `measure_prod` (`id`, `measure`) VALUES
(3, 0.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `payment`
--

CREATE TABLE `payment` (
  `id` int(11) NOT NULL,
  `nombre` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `payment`
--

INSERT INTO `payment` (`id`, `nombre`) VALUES
(1, 'Contado'),
(2, 'Crédito');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `description` varchar(45) NOT NULL,
  `id_brand` int(11) NOT NULL,
  `id_measure` int(11) NOT NULL,
  `id_section` int(11) NOT NULL,
  `id_cat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `product`
--

INSERT INTO `product` (`id`, `description`, `id_brand`, `id_measure`, `id_section`, `id_cat`) VALUES
(1, 'Celular semiusado', 2, 3, 1, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provider`
--

CREATE TABLE `provider` (
  `id` int(11) NOT NULL,
  `nit` varchar(15) NOT NULL,
  `name` varchar(40) NOT NULL,
  `address` varchar(40) NOT NULL,
  `telephone` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `provider`
--

INSERT INTO `provider` (`id`, `nit`, `name`, `address`, `telephone`) VALUES
(1, '312151', 'Ubicado', 'Mazatenango', '51212511'),
(2, '9812123', 'Casa Blanca', 'Mazatenango', '42123311');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sales`
--

CREATE TABLE `sales` (
  `id` int(11) NOT NULL,
  `amount` float NOT NULL,
  `price` float NOT NULL,
  `date` varchar(25) NOT NULL,
  `id_product` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `payment` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sales`
--

INSERT INTO `sales` (`id`, `amount`, `price`, `date`, `id_product`, `id_user`, `id_client`, `payment`) VALUES
(1, 2, 4000, '06/11/2022', 1, 1, 1, 'Contado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `section_prod`
--

CREATE TABLE `section_prod` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `section_prod`
--

INSERT INTO `section_prod` (`id`, `nombre`) VALUES
(1, 'Electrodoméstico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `shopping`
--

CREATE TABLE `shopping` (
  `id` int(11) NOT NULL,
  `amount` float DEFAULT NULL,
  `price` float NOT NULL,
  `date` varchar(25) NOT NULL,
  `id_product` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_provider` int(11) NOT NULL,
  `method_payment` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `shopping`
--

INSERT INTO `shopping` (`id`, `amount`, `price`, `date`, `id_product`, `id_user`, `id_provider`, `method_payment`) VALUES
(1, 100, 1500.5, '06/11/2022', 1, 1, 1, 'Contado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `user` varchar(20) NOT NULL,
  `password` varchar(25) NOT NULL,
  `tipo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `user`, `password`, `tipo`) VALUES
(1, 'admin', '@dm1n', 'Formain'),
(2, 'ser448401', 'abecedariox', 'Derechos'),
(3, 'test', 'test1', 'Restricciones'),
(4, 'Luis Pelico', 'elmejoringe123', 'Derechos');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `brand_prod`
--
ALTER TABLE `brand_prod`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cat_prod`
--
ALTER TABLE `cat_prod`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `measure_prod`
--
ALTER TABLE `measure_prod`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_id_brand` (`id_brand`),
  ADD KEY `fk_id_measure` (`id_measure`),
  ADD KEY `fk_id_section` (`id_section`),
  ADD KEY `fk_id_cat` (`id_cat`);

--
-- Indices de la tabla `provider`
--
ALTER TABLE `provider`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_id_product` (`id_product`) USING BTREE,
  ADD KEY `fk_id_user` (`id_user`),
  ADD KEY `fk_id_client` (`id_client`) USING BTREE;

--
-- Indices de la tabla `section_prod`
--
ALTER TABLE `section_prod`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `shopping`
--
ALTER TABLE `shopping`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_id_user` (`id_user`),
  ADD KEY `fk_id_provider` (`id_provider`),
  ADD KEY `fk_id_product` (`id_product`) USING BTREE;

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `brand_prod`
--
ALTER TABLE `brand_prod`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `cat_prod`
--
ALTER TABLE `cat_prod`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `measure_prod`
--
ALTER TABLE `measure_prod`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `payment`
--
ALTER TABLE `payment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `provider`
--
ALTER TABLE `provider`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `sales`
--
ALTER TABLE `sales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `section_prod`
--
ALTER TABLE `section_prod`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `shopping`
--
ALTER TABLE `shopping`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `fk_id_brand` FOREIGN KEY (`id_brand`) REFERENCES `brand_prod` (`id`),
  ADD CONSTRAINT `fk_id_cat` FOREIGN KEY (`id_cat`) REFERENCES `cat_prod` (`id`),
  ADD CONSTRAINT `fk_id_measure` FOREIGN KEY (`id_measure`) REFERENCES `measure_prod` (`id`),
  ADD CONSTRAINT `fk_id_section` FOREIGN KEY (`id_section`) REFERENCES `section_prod` (`id`);

--
-- Filtros para la tabla `shopping`
--
ALTER TABLE `shopping`
  ADD CONSTRAINT `fk_id_provider` FOREIGN KEY (`id_provider`) REFERENCES `provider` (`id`),
  ADD CONSTRAINT `fk_id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
