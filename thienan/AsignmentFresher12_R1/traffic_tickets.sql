-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost
-- Thời gian đã tạo: Th10 02, 2017 lúc 06:56 AM
-- Phiên bản máy phục vụ: 10.1.26-MariaDB
-- Phiên bản PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ThienAn`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `addresses`
--

CREATE TABLE `addresses` (
  `address_id` int(50) NOT NULL,
  `line_1_number_building` varchar(50) NOT NULL,
  `line_2_number_street` varchar(50) NOT NULL,
  `line_3_area_localyti_suburb` varchar(50) NOT NULL,
  `line_4_other` varchar(50) NOT NULL,
  `town_city` varchar(50) NOT NULL,
  `zip_postcode` varchar(50) NOT NULL,
  `state_province_county` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  `other_address_details` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `addresses`
--

INSERT INTO `addresses` (`address_id`, `line_1_number_building`, `line_2_number_street`, `line_3_area_localyti_suburb`, `line_4_other`, `town_city`, `zip_postcode`, `state_province_county`, `country`, `other_address_details`) VALUES
(1, '21kỉm', '11 hanoi', '2arfa', 'aee', 'hanoi', '41asdd', 'vietnam', 'sssesss', 'saeee'),
(2, 'sd44', 'aaaaa', 'a4aa', 'a4a', '4a4', 'g34', 'a4sg', 'a4a', 'a44');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `offcers`
--

CREATE TABLE `offcers` (
  `officer_badge_number` int(50) NOT NULL,
  `officer_address_id` int(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `date_of_birth` varchar(20) NOT NULL,
  `officer_first_name` varchar(50) NOT NULL,
  `officer_middle_name` varchar(50) NOT NULL,
  `officer_last_name` varchar(50) NOT NULL,
  `other_violater_detais` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `offcers`
--

INSERT INTO `offcers` (`officer_badge_number`, `officer_address_id`, `gender`, `date_of_birth`, `officer_first_name`, `officer_middle_name`, `officer_last_name`, `other_violater_detais`) VALUES
(1, 1, 'boy', '20-10-1999', 'her', 'sirs', 'arr', 'ảoaoroar'),
(2, 2, 'girl', '2-2-1929', 'ar', 'arrqw', 'vvar', 'araaf');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Ref_Document_Types`
--

CREATE TABLE `Ref_Document_Types` (
  `document_type_code` int(11) NOT NULL,
  `documentaion_type_description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ref_document_types`
--

CREATE TABLE `ref_document_types` (
  `document_type_code` int(20) NOT NULL,
  `documentaion_type_description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `ref_document_types`
--

INSERT INTO `ref_document_types` (`document_type_code`, `documentaion_type_description`) VALUES
(1, 'cmtnd'),
(2, 'giay to chinh chu');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Ref_Payment_Methods`
--

CREATE TABLE `Ref_Payment_Methods` (
  `payment_method_code` int(11) NOT NULL,
  `payment_method_description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ref_payment_methods`
--

CREATE TABLE `ref_payment_methods` (
  `payment_method_code` int(50) NOT NULL,
  `payment_method_description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `ref_payment_methods`
--

INSERT INTO `ref_payment_methods` (`payment_method_code`, `payment_method_description`) VALUES
(1, 'PAY BANKING'),
(2, 'ATM');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Ref_Ticket_Status`
--

CREATE TABLE `Ref_Ticket_Status` (
  `ticket_status_code` int(11) NOT NULL,
  `ticket_status_description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ref_ticket_status`
--

CREATE TABLE `ref_ticket_status` (
  `ticket_status_code` int(50) NOT NULL,
  `ticket_status_description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `ref_ticket_status`
--

INSERT INTO `ref_ticket_status` (`ticket_status_code`, `ticket_status_description`) VALUES
(1, 'khong hoat dong'),
(2, 'hoat dong');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Ref_Vehicle_Manufacturers`
--

CREATE TABLE `Ref_Vehicle_Manufacturers` (
  `manufacturer_code` int(11) NOT NULL,
  `manufacturer_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ref_vehicle_manufacturers`
--

CREATE TABLE `ref_vehicle_manufacturers` (
  `manufacturer_code` int(50) NOT NULL,
  `manufacturer_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `ref_vehicle_manufacturers`
--

INSERT INTO `ref_vehicle_manufacturers` (`manufacturer_code`, `manufacturer_name`) VALUES
(1, 'yamaha'),
(2, 'hoda');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Ref_Vehicle_Types`
--

CREATE TABLE `Ref_Vehicle_Types` (
  `vehicle_type_code` int(11) NOT NULL,
  `vehicle_type_description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ref_vehicle_types`
--

CREATE TABLE `ref_vehicle_types` (
  `vehicle_type_code` int(50) NOT NULL,
  `vehicle_type_description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `ref_vehicle_types`
--

INSERT INTO `ref_vehicle_types` (`vehicle_type_code`, `vehicle_type_description`) VALUES
(1, 'hayaridr'),
(2, 'afqweqeqwe');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Tickets`
--

CREATE TABLE `Tickets` (
  `ticket_number` int(11) NOT NULL,
  `date_ticket_cabcelled` varchar(50) NOT NULL,
  `date_ticket_paid` varchar(50) NOT NULL,
  `other_ticket_detais` varchar(50) NOT NULL,
  `ticket_status_code` int(11) NOT NULL,
  `violation_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tickets`
--

CREATE TABLE `tickets` (
  `ticket_number` int(50) NOT NULL,
  `ticket_status_code` int(50) NOT NULL,
  `violation_id` int(50) NOT NULL,
  `date_ticket_cabcelled` varchar(50) NOT NULL,
  `date_ticket_paid` varchar(50) NOT NULL,
  `other_ticket_detais` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tickets`
--

INSERT INTO `tickets` (`ticket_number`, `ticket_status_code`, `violation_id`, `date_ticket_cabcelled`, `date_ticket_paid`, `other_ticket_detais`) VALUES
(1, 2, 1, '20-1-2014', '20-1-2014', 'asdasd');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Vehicles`
--

CREATE TABLE `Vehicles` (
  `vehicle_licence_number` int(11) NOT NULL,
  `model` varchar(50) NOT NULL,
  `vehicle_details` varchar(50) NOT NULL,
  `year_of_manufacture` varchar(50) NOT NULL,
  `manufacturer_code` int(11) NOT NULL,
  `vehicle_type_code` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `vehicles`
--

CREATE TABLE `vehicles` (
  `vehicle_licence_number` int(50) NOT NULL,
  `manufacturer_code` int(50) NOT NULL,
  `vehicle_type_code` int(50) NOT NULL,
  `year_of_manufacture` varchar(50) NOT NULL,
  `vehicle_details` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `vehicles`
--

INSERT INTO `vehicles` (`vehicle_licence_number`, `manufacturer_code`, `vehicle_type_code`, `year_of_manufacture`, `vehicle_details`, `model`) VALUES
(1, 1, 2, '2014', 'addd', 'eport'),
(2, 1, 2, '2014', 'addd', 'eport'),
(3, 2, 2, '313', 'dad', 'a232'),
(4, 2, 2, '313', 'dad', 'a232');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Violaters`
--

CREATE TABLE `Violaters` (
  `violater_id` int(11) NOT NULL,
  `date_of_first_violation` varchar(20) NOT NULL,
  `other_violater_detais` varchar(50) NOT NULL,
  `violater_email` varchar(50) NOT NULL,
  `violater_name` varchar(20) NOT NULL,
  `violater_phone` varchar(20) NOT NULL,
  `violater_address_id` int(11) NOT NULL,
  `payment_method_code` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `violaters`
--

CREATE TABLE `violaters` (
  `violater_id` int(50) NOT NULL,
  `violater_address_id` int(100) NOT NULL,
  `payment_method_code` int(50) NOT NULL,
  `violater_name` varchar(20) NOT NULL,
  `violater_phone` varchar(20) NOT NULL,
  `violater_email` varchar(50) NOT NULL,
  `date_of_first_violation` varchar(20) NOT NULL,
  `other_violater_detais` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `violaters`
--

INSERT INTO `violaters` (`violater_id`, `violater_address_id`, `payment_method_code`, `violater_name`, `violater_phone`, `violater_email`, `date_of_first_violation`, `other_violater_detais`) VALUES
(1, 1, 2, 'cgrjkl', '12345', 'asda', '2019', 'agruif'),
(3, 1, 2, 'cgrjkl', '12345', 'asda', '2019', 'agruif');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `violater_vehicles`
--

CREATE TABLE `violater_vehicles` (
  `violater_id` int(11) NOT NULL,
  `vehicle_licence_number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Violations`
--

CREATE TABLE `Violations` (
  `violation_id` int(11) NOT NULL,
  `datetime_violation` varchar(50) NOT NULL,
  `datetune_order_delivered` varchar(50) NOT NULL,
  `other_offence_detais` varchar(50) NOT NULL,
  `vehicle_licence_number` int(11) NOT NULL,
  `violater_id` int(11) NOT NULL,
  `officer_badge_number` int(11) NOT NULL,
  `document_type_code` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `violations`
--

CREATE TABLE `violations` (
  `violation_id` int(50) NOT NULL,
  `violater_id` int(50) NOT NULL,
  `vehicle_licence_number` int(50) NOT NULL,
  `document_type_code` int(50) NOT NULL,
  `officer_badge_number` int(50) NOT NULL,
  `datetime_violation` varchar(50) NOT NULL,
  `datetune_order_delivered` varchar(50) NOT NULL,
  `other_offence_detais` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `violations`
--

INSERT INTO `violations` (`violation_id`, `violater_id`, `vehicle_licence_number`, `document_type_code`, `officer_badge_number`, `datetime_violation`, `datetune_order_delivered`, `other_offence_detais`) VALUES
(1, 1, 4, 1, 1, 'cxcxcxc', 'vcvcvcvc', 'vcvcvcvcvc');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `addresses`
--
ALTER TABLE `addresses`
  ADD PRIMARY KEY (`address_id`),
  ADD KEY `address_id` (`address_id`);

--
-- Chỉ mục cho bảng `offcers`
--
ALTER TABLE `offcers`
  ADD PRIMARY KEY (`officer_badge_number`),
  ADD KEY `fk_officer_address_id` (`officer_address_id`);

--
-- Chỉ mục cho bảng `Ref_Document_Types`
--
ALTER TABLE `Ref_Document_Types`
  ADD PRIMARY KEY (`document_type_code`);

--
-- Chỉ mục cho bảng `ref_document_types`
--
ALTER TABLE `ref_document_types`
  ADD PRIMARY KEY (`document_type_code`);

--
-- Chỉ mục cho bảng `Ref_Payment_Methods`
--
ALTER TABLE `Ref_Payment_Methods`
  ADD PRIMARY KEY (`payment_method_code`);

--
-- Chỉ mục cho bảng `ref_payment_methods`
--
ALTER TABLE `ref_payment_methods`
  ADD PRIMARY KEY (`payment_method_code`);

--
-- Chỉ mục cho bảng `Ref_Ticket_Status`
--
ALTER TABLE `Ref_Ticket_Status`
  ADD PRIMARY KEY (`ticket_status_code`);

--
-- Chỉ mục cho bảng `ref_ticket_status`
--
ALTER TABLE `ref_ticket_status`
  ADD PRIMARY KEY (`ticket_status_code`);

--
-- Chỉ mục cho bảng `Ref_Vehicle_Manufacturers`
--
ALTER TABLE `Ref_Vehicle_Manufacturers`
  ADD PRIMARY KEY (`manufacturer_code`);

--
-- Chỉ mục cho bảng `ref_vehicle_manufacturers`
--
ALTER TABLE `ref_vehicle_manufacturers`
  ADD PRIMARY KEY (`manufacturer_code`);

--
-- Chỉ mục cho bảng `Ref_Vehicle_Types`
--
ALTER TABLE `Ref_Vehicle_Types`
  ADD PRIMARY KEY (`vehicle_type_code`);

--
-- Chỉ mục cho bảng `ref_vehicle_types`
--
ALTER TABLE `ref_vehicle_types`
  ADD PRIMARY KEY (`vehicle_type_code`);

--
-- Chỉ mục cho bảng `Tickets`
--
ALTER TABLE `Tickets`
  ADD PRIMARY KEY (`ticket_number`),
  ADD KEY `FK71c2rjdffnpgtrpmiow1nnffa` (`ticket_status_code`),
  ADD KEY `FKius4xljqbi0963dsem32emegp` (`violation_id`);

--
-- Chỉ mục cho bảng `tickets`
--
ALTER TABLE `tickets`
  ADD PRIMARY KEY (`ticket_number`),
  ADD KEY `_fk_ticket_status_code` (`ticket_status_code`),
  ADD KEY `fk_violation_id` (`violation_id`);

--
-- Chỉ mục cho bảng `Vehicles`
--
ALTER TABLE `Vehicles`
  ADD PRIMARY KEY (`vehicle_licence_number`),
  ADD KEY `FK98sr5fjroy88jhfw05s9ovr0y` (`manufacturer_code`),
  ADD KEY `FKavrtjlyknrfk7m1cbbugvfcme` (`vehicle_type_code`);

--
-- Chỉ mục cho bảng `vehicles`
--
ALTER TABLE `vehicles`
  ADD PRIMARY KEY (`vehicle_licence_number`),
  ADD KEY `fk_manufacturer_code` (`manufacturer_code`),
  ADD KEY `fk_vehicle_type_code` (`vehicle_type_code`);

--
-- Chỉ mục cho bảng `Violaters`
--
ALTER TABLE `Violaters`
  ADD PRIMARY KEY (`violater_id`),
  ADD KEY `FKeu6ykdvuutken0pa7x6376ys4` (`violater_address_id`),
  ADD KEY `FKpi44kytskwsw9tyy9omvbija1` (`payment_method_code`);

--
-- Chỉ mục cho bảng `violaters`
--
ALTER TABLE `violaters`
  ADD PRIMARY KEY (`violater_id`),
  ADD KEY `fk_payment_method_code` (`payment_method_code`),
  ADD KEY `fk_violater_address_id` (`violater_address_id`);

--
-- Chỉ mục cho bảng `violater_vehicles`
--
ALTER TABLE `violater_vehicles`
  ADD PRIMARY KEY (`violater_id`),
  ADD KEY `FKa5x5349730tx66uheul80iiyp` (`vehicle_licence_number`);

--
-- Chỉ mục cho bảng `Violations`
--
ALTER TABLE `Violations`
  ADD PRIMARY KEY (`violation_id`),
  ADD KEY `FKdbe8h9iinr4qq3nb9x9w9iu79` (`officer_badge_number`),
  ADD KEY `FKm1v5cf126w1rf968lklhgso0` (`document_type_code`);

--
-- Chỉ mục cho bảng `violations`
--
ALTER TABLE `violations`
  ADD PRIMARY KEY (`violation_id`),
  ADD KEY `fk_document_type_code` (`document_type_code`),
  ADD KEY `fk_officer_badge_number` (`officer_badge_number`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `addresses`
--
ALTER TABLE `addresses`
  MODIFY `address_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `offcers`
--
ALTER TABLE `offcers`
  MODIFY `officer_badge_number` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `Ref_Document_Types`
--
ALTER TABLE `Ref_Document_Types`
  MODIFY `document_type_code` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `ref_document_types`
--
ALTER TABLE `ref_document_types`
  MODIFY `document_type_code` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `Ref_Payment_Methods`
--
ALTER TABLE `Ref_Payment_Methods`
  MODIFY `payment_method_code` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `ref_payment_methods`
--
ALTER TABLE `ref_payment_methods`
  MODIFY `payment_method_code` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `Ref_Ticket_Status`
--
ALTER TABLE `Ref_Ticket_Status`
  MODIFY `ticket_status_code` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `ref_ticket_status`
--
ALTER TABLE `ref_ticket_status`
  MODIFY `ticket_status_code` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `Ref_Vehicle_Manufacturers`
--
ALTER TABLE `Ref_Vehicle_Manufacturers`
  MODIFY `manufacturer_code` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `ref_vehicle_manufacturers`
--
ALTER TABLE `ref_vehicle_manufacturers`
  MODIFY `manufacturer_code` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `Ref_Vehicle_Types`
--
ALTER TABLE `Ref_Vehicle_Types`
  MODIFY `vehicle_type_code` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `ref_vehicle_types`
--
ALTER TABLE `ref_vehicle_types`
  MODIFY `vehicle_type_code` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `Tickets`
--
ALTER TABLE `Tickets`
  MODIFY `ticket_number` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tickets`
--
ALTER TABLE `tickets`
  MODIFY `ticket_number` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `Vehicles`
--
ALTER TABLE `Vehicles`
  MODIFY `vehicle_licence_number` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `vehicles`
--
ALTER TABLE `vehicles`
  MODIFY `vehicle_licence_number` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `Violations`
--
ALTER TABLE `Violations`
  MODIFY `violation_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `violations`
--
ALTER TABLE `violations`
  MODIFY `violation_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `offcers`
--
ALTER TABLE `offcers`
  ADD CONSTRAINT `FKmtjud1gy9v0xgjg0klaplt6uf` FOREIGN KEY (`officer_address_id`) REFERENCES `addresses` (`address_id`),
  ADD CONSTRAINT `fk_officer_address_id` FOREIGN KEY (`officer_address_id`) REFERENCES `addresses` (`address_id`);

--
-- Các ràng buộc cho bảng `Tickets`
--
ALTER TABLE `Tickets`
  ADD CONSTRAINT `FK71c2rjdffnpgtrpmiow1nnffa` FOREIGN KEY (`ticket_status_code`) REFERENCES `Ref_Ticket_Status` (`ticket_status_code`),
  ADD CONSTRAINT `FKius4xljqbi0963dsem32emegp` FOREIGN KEY (`violation_id`) REFERENCES `Violations` (`violation_id`);

--
-- Các ràng buộc cho bảng `tickets`
--
ALTER TABLE `tickets`
  ADD CONSTRAINT `_fk_ticket_status_code` FOREIGN KEY (`ticket_status_code`) REFERENCES `ref_ticket_status` (`ticket_status_code`),
  ADD CONSTRAINT `fk_violation_id` FOREIGN KEY (`violation_id`) REFERENCES `violations` (`violation_id`);

--
-- Các ràng buộc cho bảng `Vehicles`
--
ALTER TABLE `Vehicles`
  ADD CONSTRAINT `FK98sr5fjroy88jhfw05s9ovr0y` FOREIGN KEY (`manufacturer_code`) REFERENCES `Ref_Vehicle_Manufacturers` (`manufacturer_code`),
  ADD CONSTRAINT `FKavrtjlyknrfk7m1cbbugvfcme` FOREIGN KEY (`vehicle_type_code`) REFERENCES `Ref_Vehicle_Types` (`vehicle_type_code`);

--
-- Các ràng buộc cho bảng `vehicles`
--
ALTER TABLE `vehicles`
  ADD CONSTRAINT `fk_manufacturer_code` FOREIGN KEY (`manufacturer_code`) REFERENCES `ref_vehicle_manufacturers` (`manufacturer_code`),
  ADD CONSTRAINT `fk_vehicle_type_code` FOREIGN KEY (`vehicle_type_code`) REFERENCES `ref_vehicle_types` (`vehicle_type_code`);

--
-- Các ràng buộc cho bảng `Violaters`
--
ALTER TABLE `Violaters`
  ADD CONSTRAINT `FKeu6ykdvuutken0pa7x6376ys4` FOREIGN KEY (`violater_address_id`) REFERENCES `addresses` (`address_id`),
  ADD CONSTRAINT `FKpi44kytskwsw9tyy9omvbija1` FOREIGN KEY (`payment_method_code`) REFERENCES `Ref_Payment_Methods` (`payment_method_code`);

--
-- Các ràng buộc cho bảng `violaters`
--
ALTER TABLE `violaters`
  ADD CONSTRAINT `fk_payment_method_code` FOREIGN KEY (`payment_method_code`) REFERENCES `ref_payment_methods` (`payment_method_code`),
  ADD CONSTRAINT `fk_violater_address_id` FOREIGN KEY (`violater_address_id`) REFERENCES `addresses` (`address_id`);

--
-- Các ràng buộc cho bảng `violater_vehicles`
--
ALTER TABLE `violater_vehicles`
  ADD CONSTRAINT `FKa5x5349730tx66uheul80iiyp` FOREIGN KEY (`vehicle_licence_number`) REFERENCES `Vehicles` (`vehicle_licence_number`);

--
-- Các ràng buộc cho bảng `Violations`
--
ALTER TABLE `Violations`
  ADD CONSTRAINT `FKdbe8h9iinr4qq3nb9x9w9iu79` FOREIGN KEY (`officer_badge_number`) REFERENCES `offcers` (`officer_badge_number`),
  ADD CONSTRAINT `FKm1v5cf126w1rf968lklhgso0` FOREIGN KEY (`document_type_code`) REFERENCES `Ref_Document_Types` (`document_type_code`);

--
-- Các ràng buộc cho bảng `violations`
--
ALTER TABLE `violations`
  ADD CONSTRAINT `fk_document_type_code` FOREIGN KEY (`document_type_code`) REFERENCES `ref_document_types` (`document_type_code`),
  ADD CONSTRAINT `fk_officer_badge_number` FOREIGN KEY (`officer_badge_number`) REFERENCES `offcers` (`officer_badge_number`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
