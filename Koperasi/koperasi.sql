-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2019 at 11:27 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `koperasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `no_ang` varchar(8) NOT NULL,
  `nama_ang` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `kota` varchar(20) NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`no_ang`, `nama_ang`, `alamat`, `kota`, `no_telp`, `pekerjaan`) VALUES
('19120', 'Adis', 'jl. Gunung Jati', 'Malang', '081818181', 'mahasiswa');

-- --------------------------------------------------------

--
-- Table structure for table `detail_simpanan`
--

CREATE TABLE `detail_simpanan` (
  `nosimpan` varchar(11) NOT NULL,
  `no_ang` varchar(8) NOT NULL,
  `debet` double NOT NULL,
  `kredit` double NOT NULL,
  `saldo` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_simpanan`
--

INSERT INTO `detail_simpanan` (`nosimpan`, `no_ang`, `debet`, `kredit`, `saldo`) VALUES
('SP-19120', '19120', 50000, 0, 50000);

-- --------------------------------------------------------

--
-- Table structure for table `pinjaman`
--

CREATE TABLE `pinjaman` (
  `kd_pinj` varchar(30) NOT NULL,
  `jns_pinj` varchar(30) DEFAULT NULL,
  `max_pinj` varchar(30) DEFAULT NULL,
  `max_ang` varchar(30) DEFAULT NULL,
  `bunga` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `simpan`
--

CREATE TABLE `simpan` (
  `no_ang` varchar(8) NOT NULL,
  `username` varchar(30) NOT NULL,
  `tanggal` varchar(30) NOT NULL,
  `ket` varchar(30) NOT NULL,
  `saldo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `simpan`
--

INSERT INTO `simpan` (`no_ang`, `username`, `tanggal`, `ket`, `saldo`) VALUES
('19120', 'adis', '08 januari 2000', 'spp', '50000');

-- --------------------------------------------------------

--
-- Table structure for table `simpanan`
--

CREATE TABLE `simpanan` (
  `kd_simp` varchar(4) NOT NULL,
  `jns_simp` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `trans_pinjaman`
--

CREATE TABLE `trans_pinjaman` (
  `nopinjam` varchar(11) NOT NULL,
  `tglpinjam` date NOT NULL,
  `no_ang` varchar(8) NOT NULL,
  `keterangan` varchar(20) NOT NULL,
  `pinjpokok` double NOT NULL,
  `lama` int(11) NOT NULL,
  `bunga` double NOT NULL,
  `admin` int(11) NOT NULL,
  `jml` double NOT NULL,
  `total` double NOT NULL,
  `angsuran` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trans_pinjaman`
--

INSERT INTO `trans_pinjaman` (`nopinjam`, `tglpinjam`, `no_ang`, `keterangan`, `pinjpokok`, `lama`, `bunga`, `admin`, `jml`, `total`, `angsuran`) VALUES
('PJ-19120', '2019-12-12', '19120', 'spp', 100000, 10, 10, 10, 20000, 120000, 12000);

-- --------------------------------------------------------

--
-- Table structure for table `trans_simpanan`
--

CREATE TABLE `trans_simpanan` (
  `nosimpan` varchar(11) NOT NULL,
  `tglsimpan` date NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `saldo` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trans_simpanan`
--

INSERT INTO `trans_simpanan` (`nosimpan`, `tglsimpan`, `jenis`, `saldo`) VALUES
('SP-19120', '2019-12-12', '19120', 50000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`no_ang`),
  ADD KEY `no_ang` (`no_ang`),
  ADD KEY `no_ang_2` (`no_ang`),
  ADD KEY `no_ang_3` (`no_ang`),
  ADD KEY `no_ang_4` (`no_ang`),
  ADD KEY `no_ang_5` (`no_ang`);

--
-- Indexes for table `detail_simpanan`
--
ALTER TABLE `detail_simpanan`
  ADD PRIMARY KEY (`nosimpan`,`no_ang`),
  ADD KEY `no_ang` (`no_ang`),
  ADD KEY `nosimpan` (`nosimpan`,`no_ang`);

--
-- Indexes for table `pinjaman`
--
ALTER TABLE `pinjaman`
  ADD PRIMARY KEY (`kd_pinj`);

--
-- Indexes for table `simpan`
--
ALTER TABLE `simpan`
  ADD PRIMARY KEY (`no_ang`),
  ADD KEY `no_ang` (`no_ang`),
  ADD KEY `no_ang_2` (`no_ang`);

--
-- Indexes for table `simpanan`
--
ALTER TABLE `simpanan`
  ADD PRIMARY KEY (`kd_simp`);

--
-- Indexes for table `trans_pinjaman`
--
ALTER TABLE `trans_pinjaman`
  ADD PRIMARY KEY (`nopinjam`,`no_ang`),
  ADD KEY `nopinjam` (`nopinjam`,`no_ang`),
  ADD KEY `nopinjam_2` (`nopinjam`,`no_ang`),
  ADD KEY `nopinjam_3` (`nopinjam`,`no_ang`),
  ADD KEY `no_ang` (`no_ang`),
  ADD KEY `no_ang_2` (`no_ang`),
  ADD KEY `nopinjam_4` (`nopinjam`,`no_ang`);

--
-- Indexes for table `trans_simpanan`
--
ALTER TABLE `trans_simpanan`
  ADD PRIMARY KEY (`nosimpan`),
  ADD KEY `nosimpan` (`nosimpan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
