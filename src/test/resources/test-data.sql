DELETE FROM applications;
DELETE FROM works;
DELETE FROM events;
DELETE FROM users_companies;
DELETE FROM companies;
DELETE FROM users;

INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (1, 'Satuk', 'Kolan', 'password', 'satuk@kolan.ch', 'Im Brünneli 8', 33, 8127, 0793085018, 'Maur', {ts '2017-01-01 00:00:00.00'});

INSERT INTO companies (id, name, address, city, postal_code, description, url, logo, public_events, date_created) VALUES (1, 'Aura', 'Bleicherweg 5', 'Zurich', 8001, 'AURA Restaurant, Bar & Smoker''s Lounge, Eventsaal', 'https://www.aura-zurich.ch/', 'https://www.aura-event.ch/wp-content/uploads/2015/09/footer75_aura1.png', true, {ts '2017-01-01'});
INSERT INTO companies (id, name, address, city, postal_code, description, url, logo, public_events, date_created) VALUES (2, 'Metropol', 'Fraumunsterstrasse 12', 'Zurich', 8001, 'Metropol Restaurant & Café /Bar', 'http://metropol-restaurant.ch/', 'http://www.metropol-restaurant.ch/wp-content/uploads/2017/04/metropol_logo-300x72.png', true, {ts '2017-01-01'});

INSERT INTO events (id, name, logo, date, start, end, different_location, expected_person, company_id, description, date_created, visibility) VALUES (1, 'PLANET 105 WE LOVE IBIZA BOAT', 'http://zuerich.usgang.ch/uploadfile/flyer/751920.jpg', {ts '2017-10-10'}, {ts '2017-01-01 18:00:00.00'}, {ts '2017-01-01 23:59:00.00'}, 0, 400, 1, 'DJs Tanja La Croix, Sam, Alex Price, Dino Supreme Show', {ts '2017-01-01'}, true );

INSERT INTO users_companies(user_id, companies_id) VALUES (1, 1);

INSERT INTO applications(id, date_created, event_id, user_id) VALUES (1, {ts '2017-01-01 00:00:00.00'}, 1, 1);
