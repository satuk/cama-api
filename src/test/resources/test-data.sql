DELETE FROM events;
DELETE FROM users;
DELETE FROM companies;

INSERT INTO users (id, first_name, last_name, password, email, address, age, city, postal_code, date_created, handy_number) VALUES (1, 'ryker', 'bryant', 'password', 'Ry.BRYA5509@monumentmail.com', '4787 78th', 25, 'zurich', 4219, {ts '2017-01-01'}, 0793085018);

INSERT INTO companies (id, name, address, postal_code, description, url, date_created) VALUES (1, 'rockwell automation', '6354 germania, milwaukee, wisconsin, united states, 53498', 1923, 'Lorem ipsum auctor metus mus commodo auctor elit montes aliquet.\nAuctor dictum ornare duis sem malesuada venenatis nec interdum justo nascetur.\n', 'http://www.163.com/resources/stories/2015/08/logo.jpg', {ts '2017-01-01'});

INSERT INTO events (id, event_name, logo, event_date, event_start, event_end, different_location, expected_person, company_id, date_created, visibility) VALUES (1, 'Istanbul Night', 'http://www.satuk.ch/dsadksaka.png', {ts '2017-01-01'}, {ts '2017-01-01 00:00:00.00'}, {ts '2017-01-01 00:00:00.00'}, false, 1000, 1, {ts '2017-01-01'}, true);
