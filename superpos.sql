-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2020 at 12:37 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `superpos`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `id` int(11) NOT NULL,
  `brand` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`id`, `brand`, `status`) VALUES
(3, 'Sony', 'Deactive'),
(4, 'Sumsung', 'Active'),
(7, 'Singer', 'Active'),
(8, 'LG', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `cashier`
--

CREATE TABLE `cashier` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cashier`
--

INSERT INTO `cashier` (`id`, `name`, `username`, `password`, `status`) VALUES
(1, 'kobi', 'kobi', '123456', 'Active'),
(3, 'nishan', 'nishan', '123', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `status` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`, `status`) VALUES
(20, 'Drink', 'Active'),
(21, 'TV', 'Active'),
(23, 'mobile', 'Active'),
(25, 'Fan', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `productname` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `category` int(11) NOT NULL,
  `brand` int(11) NOT NULL,
  `costprice` int(11) NOT NULL,
  `retailprice` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `barcode` int(11) NOT NULL,
  `status` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `productname`, `description`, `category`, `brand`, `costprice`, `retailprice`, `qty`, `barcode`, `status`) VALUES
(7, 'LG 1001', 'LG 1001', 21, 5, 30000, 40000, 25, 333, 'Active'),
(10, 'Sony Tv', 'SSony Tv only', 21, 3, 12000, 15000, 45, 222, 'Active'),
(11, 'coco', 'coco only', 20, 6, 12, 30, 45, 999, 'Active'),
(12, 'Samsung galaxy 222', 'Samsung galaxy 222 fdsf', 23, 4, 25000, 30000, 53, 111, 'Active'),
(13, 'sfdsf', 'ewerw', 20, 3, 343, 567, 45, 454, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `productname` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `category` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `productname`, `description`, `category`) VALUES
(1, 'soya23', 'sadasa', 16),
(2, 'Lg ballon', 'Lg ballon dfdf', 17),
(3, 'kobi 899', 'sdsfdsf', 19);

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `id` int(11) NOT NULL,
  `date` varchar(255) NOT NULL,
  `subtotal` int(11) NOT NULL,
  `cashier` varchar(255) NOT NULL,
  `pay` int(11) NOT NULL,
  `balance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`id`, `date`, `subtotal`, `cashier`, `pay`, `balance`) VALUES
(37, '2019/01/29', 375000, '', 400000, 25000),
(38, '2019/01/29', 1410000, 'kobi', 2000000, 590000),
(39, '2019/01/31', 300000, '', 300000, 0),
(40, '2019/02/14', 195000, '', 200000, 5000),
(41, '2019/02/14', 105000, '', 200000, 95000),
(42, '2019/02/14', 30000, '', 40000, 10000),
(43, '2019/04/21', 60000, '', 700000, 640000),
(44, '2019/04/21', 90000, '', 2333, -87667),
(45, '2019/04/21', 180000, '', 2222, -177778),
(46, '2019/04/21', 90000, '', 3333, -86667),
(47, '2019/04/22', 105000, '', 2333, -102667),
(48, '2019/04/22', 435000, '', 333, -434667),
(49, '2019/04/22', 180000, '', 2222, -177778),
(50, '2019/04/22', 90000, '', 333, -89667),
(51, '2019/07/01', 150000, 'kobi', 200000, 50000);

-- --------------------------------------------------------

--
-- Table structure for table `sales_product`
--

CREATE TABLE `sales_product` (
  `id` int(11) NOT NULL,
  `sales_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `sell_price` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales_product`
--

INSERT INTO `sales_product` (`id`, `sales_id`, `product_id`, `sell_price`, `qty`, `total`) VALUES
(56, 37, 111, 30000, 10, 300000),
(57, 37, 222, 15000, 5, 75000),
(58, 38, 222, 15000, 2, 30000),
(59, 38, 111, 30000, 2, 60000),
(60, 38, 333, 40000, 33, 1320000),
(61, 39, 111, 30000, 10, 300000),
(62, 40, 222, 15000, 3, 45000),
(63, 40, 111, 30000, 5, 150000),
(64, 41, 222, 15000, 3, 45000),
(65, 41, 111, 30000, 2, 60000),
(66, 42, 222, 15000, 2, 30000),
(67, 43, 111, 30000, 2, 60000),
(68, 44, 111, 30000, 3, 90000),
(69, 45, 111, 30000, 2, 60000),
(70, 45, 222, 15000, 2, 30000),
(71, 45, 111, 30000, 3, 90000),
(72, 46, 222, 15000, 2, 30000),
(73, 46, 111, 30000, 2, 60000),
(74, 47, 111, 30000, 2, 60000),
(75, 47, 222, 15000, 3, 45000),
(76, 48, 222, 15000, 22, 330000),
(77, 48, 111, 30000, 2, 60000),
(78, 48, 222, 15000, 3, 45000),
(79, 49, 222, 15000, 2, 30000),
(80, 49, 333, 40000, 3, 120000),
(81, 49, 222, 15000, 2, 30000),
(82, 50, 222, 15000, 2, 30000),
(83, 50, 111, 30000, 2, 60000),
(84, 51, 222, 15000, 2, 30000),
(85, 51, 333, 40000, 3, 120000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cashier`
--
ALTER TABLE `cashier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales_product`
--
ALTER TABLE `sales_product`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `cashier`
--
ALTER TABLE `cashier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT for table `sales_product`
--
ALTER TABLE `sales_product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=86;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
