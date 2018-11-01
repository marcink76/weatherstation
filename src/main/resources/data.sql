INSERT INTO weatherstation2.measurement (data_pomiaru,
                                         wilgotnosc,
                                         pm0_1,
                                         pm10,
                                         pm2_5,
                                         ciśnienie,
                                         temperatura,
                                         czas_pomiaru,
                                         deszcz,
                                         intensywność_opadu,
                                         punkt_rosy)
VALUES ('2018-09-28', '24', '34', '45', '54', '1014', '24', '22:10', true, '125', '1.23');
INSERT INTO weatherstation2.measurement (data_pomiaru,
                                         wilgotnosc,
                                         pm0_1,
                                         pm10,
                                         pm2_5,
                                         ciśnienie,
                                         temperatura,
                                         czas_pomiaru,
                                         deszcz,
                                         intensywność_opadu,
                                         punkt_rosy)
VALUES ('2018-09-29', '34', '34', '23', '11', '1020', '14', '22:30', true, '156', '1.45');
INSERT INTO weatherstation2.measurement (data_pomiaru,
                                         wilgotnosc,
                                         pm0_1,
                                         pm10,
                                         pm2_5,
                                         ciśnienie,
                                         temperatura,
                                         czas_pomiaru,
                                         deszcz,
                                         intensywność_opadu,
                                         punkt_rosy)
VALUES ('2018-09-29', '24', '37', '45', '354', '1034', '33', '23:20', false, '195', '1.78');
INSERT INTO weatherstation2.measurement (data_pomiaru,
                                         wilgotnosc,
                                         pm0_1,
                                         pm10,
                                         pm2_5,
                                         ciśnienie,
                                         temperatura,
                                         czas_pomiaru,
                                         deszcz,
                                         intensywność_opadu,
                                         punkt_rosy)
VALUES ('2018-09-29', '34', '34', '23', '11', '1020', '14', '22:30', false, '250', '2.34');
INSERT INTO weatherstation2.measurement (data_pomiaru,
                                         wilgotnosc,
                                         pm0_1,
                                         pm10,
                                         pm2_5,
                                         ciśnienie,
                                         temperatura,
                                         czas_pomiaru,
                                         deszcz,
                                         intensywność_opadu,
                                         punkt_rosy)
VALUES ('2018-09-30', '32', '14', '23', '41', '1000', '13', '23:40', true, '320', '1.43');

INSERT INTO weatherstation2.rfid_card (rfid_card_number)
VALUES ('D1 9E 23 D9');
INSERT INTO weatherstation2.rfid_card (rfid_card_number)
VALUES ('EA 7D DB 2B');

INSERT INTO weatherstation2.user (first_name, last_name)
values ('Marcin', 'Coni');
INSERT INTO weatherstation2.user (first_name, last_name)
VALUES ('Nina', 'Coni');
