-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 13, 2020 at 11:08 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `algorithm_mcq`
--

-- --------------------------------------------------------

--
-- Table structure for table `checkans`
--

CREATE TABLE `checkans` (
  `q_no` int(11) NOT NULL,
  `useranswer` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `computer`
--

CREATE TABLE `computer` (
  `id` int(11) NOT NULL,
  `question` varchar(100) NOT NULL,
  `option1` varchar(100) NOT NULL,
  `option2` varchar(100) NOT NULL,
  `option3` varchar(100) NOT NULL,
  `option4` varchar(100) NOT NULL,
  `correctans` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `computer`
--

INSERT INTO `computer` (`id`, `question`, `option1`, `option2`, `option3`, `option4`, `correctans`) VALUES
(1, 'What is the use of Hard Disk in Computer?', 'To create files and folders', 'To run antivirus program', 'To save Data', 'To transfer data from one PC to another', 'To save Data'),
(2, 'What is the full form of PDF files?', 'Portable Document Format files', 'Portable Documentation Format files', 'Portable Document Format program', 'Programmable Document Format files', 'Portable Document Format files'),
(3, 'The first mechanical computer designed by Charles Babbage was called ?', 'Abacus', 'Analytical Engine', 'Calculator', 'Processor', 'Analytical Engine'),
(4, 'Which of the following is the most powerful type of computer ?', 'Super-micro', 'Super conductor', 'Super computer', 'Mainframe', 'Super computer'),
(5, 'What is a single integrated circuit?', 'Gate', 'Mother Board', 'Chip', 'CPU', 'Gate'),
(6, 'Programming language C is?', 'A third generation high level language', 'A machine language', 'An assembly language', 'All of the above', 'A third generation high level language'),
(7, 'Web pages are written using?', 'FTP', 'HTTP', 'URL', 'HTML', 'HTML'),
(8, 'Which of the following is an example of non volatile memory ?', 'VLSI', 'LSI', 'ROM', 'RAM', 'ROM'),
(9, 'The _____ is the administrative section of the computer system?', 'CPU', 'Memory Unit', 'Input Unit', 'Control Unit', 'CPU'),
(10, 'FPI stands for?', 'Faults per inch', 'Frames per inch', 'Film per inch', 'Figure per inch', 'Frames per inch'),
(11, 'A device that converts digital signal to analog signals is?', 'A packet', 'A modem', 'A block', 'Both A and B', 'A modem'),
(12, 'One byte is equivalent to ?', '4 bits', '8 bits', '12 bits', '32 bits', '8 bits'),
(13, 'What is the primary requisite of a good computer programmer? ', 'Mathematical mind', 'Artistic mind', 'Logical mind', 'Scientific knowledge', 'Logical mind'),
(14, 'Find the odd man out. ', 'FTP', 'POP', 'SAP', 'TCP', 'POP'),
(15, 'Find the odd one out ?', 'mouse', 'keyboard', 'printer', 'touch screen', 'printer'),
(16, 'Web pages are written using ?', 'HTML', 'URL', 'UML', 'FTP', 'HTML'),
(17, 'India’s first super computer is ?', 'agni', 'flow solver', 'param', 'trisul', 'param'),
(18, 'Which of the following is NOT operating system ?', 'dos', 'unix', 'windows nt', 'java', 'java'),
(19, 'The computer that is not considered as a portable computer is ?', 'laptop', 'mini computer', 'notebook computer', 'none of these', 'mini computer'),
(20, '------ is need to build dynamic web documents?', 'CGI', 'java', 'html', 'all of the above', 'all of the above'),
(21, 'ROM is composed of', 'Floppy disks', 'Magnetic cores', 'Microprocessors', 'Photoelectric cells', 'Photoelectric cells'),
(22, 'Find the odd man out. ', 'Google', 'Lycos', 'Altavista', 'Java', 'Java'),
(23, 'What is the number of bit patterns provided by a 7 bit code? ', '64', '256', '128', '512', '256'),
(24, 'Compilers and Interpreters are themselves ?', 'Compilers and Interpreters are themselves', 'Codes', 'Mnemonics', 'Programs', 'Programs'),
(25, 'A terabyte comprises ?', '1024 gigabyte', '1024 kilobyte', '1024 megabyte', '1024 byte', '1024 gigabyte');

-- --------------------------------------------------------

--
-- Table structure for table `english`
--

CREATE TABLE `english` (
  `id` int(11) NOT NULL,
  `question` varchar(100) NOT NULL,
  `option1` varchar(100) NOT NULL,
  `option2` varchar(100) NOT NULL,
  `option3` varchar(100) NOT NULL,
  `option4` varchar(100) NOT NULL,
  `correctans` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `english`
--

INSERT INTO `english` (`id`, `question`, `option1`, `option2`, `option3`, `option4`, `correctans`) VALUES
(1, 'The thief was sent to ____ prison', 'a', 'an', 'no article', 'the', 'the'),
(2, 'I____ tennis every Sunday morning.', 'playing', 'play', 'am playing', 'am play', 'play'),
(3, 'Jun-Sik ..... his teeth before breakfast every morning.', 'will cleaned', 'is cleaning', 'cleans', 'clean', 'cleans'),
(4, 'what is height of Mt. Everest?', '8848m', '8895m', '8879m', '8869m', '8848m'),
(5, '____ many times every winter in Frankfurt.', 'It snows', 'It snowed', 'It is snowing', 'It is snow', 'It snows'),
(6, 'Babies ____ when they are hungry.', 'cries', 'cried', 'cry', 'are crying', 'cry'),
(7, 'Suman is ill and we\'ll have to ___ the meeting for a few days.', 'put on', 'put of', 'put away', 'put off', 'put off'),
(8, 'The cat and dog have a ___ enemy in rat.', 'same', 'common', 'mutual', 'similar', 'common'),
(9, 'He told me that he ___ watching the movie', 'is finished', 'was finished', 'had finished', 'not finished', 'had finished'),
(10, 'He is very good ___ making stories.', 'at', 'in', 'about', 'for', 'at'),
(11, 'I do my work ___ carefully to make mistakes.', 'so', 'very', 'more', 'too', 'too'),
(12, 'Opposite of Plausible is___', 'inplausible', 'implausible', 'displausible', 'unplausible', 'implausible'),
(13, 'Opposite of Frailty is ___', 'strength', 'intensity', 'energy', 'vehemence', 'strength'),
(14, 'Opposite of Genial is ___', 'stupid', 'stingy', 'boorish', 'unkind', 'boorish'),
(15, 'Opposite of Prevent is ___', 'protect', 'block', 'hinder', 'induce', 'induce'),
(16, 'Opposite of Demolish is ___', 'Shift', 'build', 'repeat', 'hide', 'build'),
(17, 'Meaning of the word Defer is ___', 'indifferent', 'defy', 'differ', 'postpone', 'postpone'),
(18, 'Meaning of the word Abandon is ___', 'forsake', 'keep', 'cherish', 'Enlarge', 'forsake'),
(19, 'Meaning of the word Cease is ___', 'begin', 'stop', 'create', 'dull', 'stop'),
(20, 'Meaning of the word Cancel is ___', 'abolish', 'approve', 'allow', 'break', 'abolish'),
(21, 'These medicines are ___ for curing cold', 'proper', 'real', 'effective', 'capable', 'effective'),
(22, 'It was ___ hot that day and the cable suffered the burnt of the heat', 'treacherously', 'acceptably', 'unfailingly', 'unbelievably', 'unbelievably'),
(23, 'Dowry is no longer permitted by law even in ___ marriage.', 'love', 'conventional', 'natural', 'bigamous', 'love'),
(24, 'Anita ___ me of a girl I used to know.', 'remembers', 'recalls', 'recollects', 'reminds', 'reminds'),
(25, 'He applied for and was ___ legal aid by Labour Ministry.', 'offered', 'granted', 'allowed', 'awarded', 'granted');

-- --------------------------------------------------------

--
-- Table structure for table `gk`
--

CREATE TABLE `gk` (
  `id` int(11) NOT NULL,
  `question` varchar(100) NOT NULL,
  `option1` varchar(100) NOT NULL,
  `option2` varchar(100) NOT NULL,
  `option3` varchar(100) NOT NULL,
  `option4` varchar(100) NOT NULL,
  `correctans` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gk`
--

INSERT INTO `gk` (`id`, `question`, `option1`, `option2`, `option3`, `option4`, `correctans`) VALUES
(1, 'The language spoken by the people by Pakistan is ?', 'hindi', 'palauan', 'sindhi', 'nauruan', 'sindhi'),
(2, 'The World Largest desert is ?', 'thar', 'kalahari', 'sahara', 'sonoran', 'sahara'),
(3, 'Country that has the highest in Barley Production ?', 'china', 'india', 'russia', 'france', 'russia'),
(4, 'The metal whose salts are sensitive to light is ?', 'zinc', 'silver', 'copper', 'aluminium', 'silver'),
(5, 'The Central Rice Research Station is situated in ?', 'chennai', 'cuttak', 'bangalore', 'quilon', 'cuttack'),
(6, 'Mount Everest is located in ?', 'nepal', 'india', 'tibet', 'china', 'nepal'),
(7, 'Which soil is suitable for agriculture ?', 'red soil', 'sand', 'black soil', 'peaty soil', 'peaty soil'),
(8, 'Black soils are best suited for the cultivation of ?', 'cotton', 'rice', 'cereals', 'sugarcane', 'cotton'),
(9, 'The device used for measuring altitudes is ?', 'altimeter', 'ammeter', 'audiometer', 'galvanometer', 'altimeter'),
(10, 'The gate way of india is?', 'chennai', 'mumbai', 'kolkata', 'new delhi', 'mumbai'),
(11, 'The first chairman of the Atomic Energy Commission was ?', 'Dr.C.V.Raman', 'Dr.H.J.Bhabha', 'Dr.A.P.J.Abdul Kalam', 'Dr.Vickram Sarabhai', 'Dr.H.J.Bhabha'),
(12, 'D.D.T. was invented by ?', 'mosley', 'rudeolf', 'karl benz', 'dalton', 'mosley'),
(13, 'The gas used for making vegetables is ?', 'oxygen', 'carbon dioxide', 'hydrogen', 'nitrogen', 'hydrogen'),
(14, 'The chief ore of Aluminium is ?', 'iron', 'cryolite', 'bauxite', 'heamatite', 'bauxite'),
(15, 'Sharavati projects is in ?', 'orissa', 'kerala', 'andhra pradesh', 'karnataka', 'karnataka'),
(16, 'Country that was called as Land of Rising Sun ? ', 'russia', 'japan', 'korea', 'holland', 'japan'),
(17, 'Pink city in India is ?', 'mysore', 'karnataka', 'hyderabad', 'jaipur', 'jaipur'),
(18, 'Deficiency of Iron leads to ?', 'rickets', 'malaria', 'dental cavity', 'anaemia', 'anaemia'),
(19, 'Capital city of Nepal?', 'Tokyo', 'Kathmandu', 'London', 'Bhaktapur', 'Kathmandu'),
(20, 'Lake in highest altitude in Nepal is?', 'tilicho', 'rara', 'begnas', 'phoksundo', 'tilicho'),
(21, 'The chemical name of Chloroform is ? ', 'Sulphuric acid', 'Sodium Chloride', 'Sodium Carbonate', 'Trichloromethane ', 'Trichloromethane '),
(22, 'The longest river in Nepal is?', 'karnali', 'koshi', 'seti', 'bagmati', 'karnali'),
(23, 'The hottest planet in the solar system ? ', 'earth', 'venus', 'mars', 'jupiter', 'venus'),
(24, '“One People, One State, One leader” was the policy of ? ', 'stalin', 'hitler', 'lenin', 'mussolin', 'hitler'),
(27, 'Where was gautam buddha born?', 'Nepal', 'Bhutan', 'India', 'China', 'Nepal');


-- --------------------------------------------------------

--
-- Table structure for table `science`
--

CREATE TABLE `science` (
  `id` int(11) NOT NULL,
  `question` varchar(100) NOT NULL,
  `option1` varchar(100) NOT NULL,
  `option2` varchar(100) NOT NULL,
  `option3` varchar(100) NOT NULL,
  `option4` varchar(100) NOT NULL,
  `correctans` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `science`
--

INSERT INTO `science` (`id`, `question`, `option1`, `option2`, `option3`, `option4`, `correctans`) VALUES
(1, 'Which one of the following remains constant while throwing a ball upward?', 'velocity', 'displacement', 'acceleration', 'kinectic energy', 'acceleration'),
(2, 'Which one among the following radiations carries maximum energy? ', 'gamma rays', 'x–rays', 'infra red rays', 'ultraviolet rays', 'gamma rays'),
(3, 'Which one of the following is the unit of activity of a radioactive source?', 'Siemens', 'Lux', 'Tesla', 'Becquerrel', 'Becquerrel'),
(4, 'Which one of the following common devices works on the basis of the principle of mutual induction? ', 'LED', 'Transformer', 'Photodiode', 'ube light', 'Transformer'),
(5, 'Oil or soap film when in daylight appears coloured because of ', 'reflection', 'interference', 'refraction', 'surface energy', 'interference'),
(6, 'Retina contains the sensitive cells called ', 'rods and cones', 'cones and cortex', 'rods and pelvis', 'cortex and fovea', 'rods and cones'),
(7, 'Number of bones in human body is', '206', '225', '220', '215', '206'),
(8, 'Birds excrete nitrogenous waste in the form of', 'urea', 'ammonia', 'fatty acids', 'uric acid', 'uric acid'),
(9, 'In scorpion, poison is present in the ', 'leg', 'hand', 'sting', 'mouth', 'sting'),
(10, 'Medulla oblongata is called ', 'piamater', 'duramater', 'vital knot', 'pons verolii', 'vital knot'),
(11, 'A woman’s voice is shriller than man’s voice due to ', 'lower frequency', 'higher frequency', 'weak vocal chords', 'higher amplitude', 'higher frequency'),
(12, 'Which one of the following is used as a moderator in nuclear reactor ', 'radium', 'graphite', 'thorium', 'ordinary water', 'graphite'),
(13, 'Recording of sound on tapes was first invented by ', 'Fleming', 'Ampere', 'Poulsen', 'Becquerrel', 'Poulsen'),
(14, 'Which one of the following would be most powerful electro magnet?', 'soft iron', 'steel', 'copper', 'air', 'soft iron'),
(15, 'Production of beats is a result of the phenomenon of ', 'reflection', 'resonance', 'interference', 'superposition', 'interference'),
(16, 'Night blindness is caused due to deficiency of ', 'Vitamin A', 'Vitamin B', 'Vitamin E', 'Vitamin K', 'Vitamin A'),
(17, 'The length of the spinal cord is about ', '60 cm', '45 cm', '90 cm', '10 cm', '45 cm'),
(18, 'Bleeding of gums is one of the symptoms of ', 'beri–beri', 'scurvy', 'sterility', 'pellagra', 'scurvy'),
(19, 'Rabies is transmitted by ', 'bugs', 'flies', 'infected mad dogs', 'mosquitoes', 'infected mad dogs'),
(20, 'The outer convex region of kidney is called', 'cortex', 'calyces', 'nephron', 'pelvis', 'cortex'),
(21, 'Supersonic plane fly with the speed ', 'less than the speed of sound', 'of sound', 'greater than the speed of sound', 'of light', 'greater than the speed of sound'),
(22, 'Mach number is used in connection with the speed of ', 'sound', 'aircraft', 'spacecraft', 'ships ', 'aircraft'),
(23, 'On a stationary sail boat, air is blown from a fan attached to the boat. The boat', 'moves in opposite direction in which the air is blown', 'does not move', 'moves in the same direction in which air blows', 'spins around', 'does not move'),
(24, 'Atmospheric pressure is measured by ', 'Tonometer', 'Pyrometer', 'Barometer', 'Thermometer', 'Barometer'),
(25, 'Sudden fall in barometer is indication of ', 'Storm', 'Rain', 'Tide', 'Clear weather', 'Storm');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `Id` int(11) NOT NULL,
  `User_Name` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Token` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`Id`, `User_Name`, `Password`, `Address`, `Token`) VALUES
(1, 'saurav', 'pass', 'jadibuti', '7111saurav'),
(4, 'saurav', 'pass', 'jadibuti', '8848saurav');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `checkans`
--
ALTER TABLE `checkans`
  ADD PRIMARY KEY (`q_no`);

--
-- Indexes for table `computer`
--
ALTER TABLE `computer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `english`
--
ALTER TABLE `english`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `gk`
--
ALTER TABLE `gk`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `science`
--
ALTER TABLE `science`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Token` (`Token`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `computer`
--
ALTER TABLE `computer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `english`
--
ALTER TABLE `english`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `gk`
--
ALTER TABLE `gk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `science`
--
ALTER TABLE `science`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
