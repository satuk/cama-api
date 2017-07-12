INSERT INTO companies (id, name, address, city, postal_code, description, url, logo, public_events, date_created) VALUES (1, 'Aura', 'Bleicherweg 5', 'Zurich', 8001, 'AURA Restaurant, Bar & Smoker''s Lounge, Eventsaal', 'https://www.aura-zurich.ch/', 'https://www.aura-event.ch/wp-content/uploads/2015/09/footer75_aura1.png', false, {ts '2017-01-01'});
INSERT INTO companies (id, name, address, city, postal_code, description, url, logo, public_events, date_created) VALUES (2, 'Metropol', 'Fraumunsterstrasse 12', 'Zurich', 8001, 'Metropol Restaurant & Café /Bar', 'http://metropol-restaurant.ch/', 'http://www.metropol-restaurant.ch/wp-content/uploads/2017/04/metropol_logo-300x72.png', true, {ts '2017-01-01'});
INSERT INTO companies (id, name, address, city, postal_code, description, url, logo, public_events, date_created) VALUES (3, 'Candrian AG', 'Bahnhofpl. 15', 'Zurich', 8001, 'Candrian Catering', 'http://www.candriancatering.ch', 'http://www.candriancatering.ch/redesign3/Bilder/candrian_home_01.png', true, {ts '2017-01-01'});
INSERT INTO companies (id, name, address, city, postal_code, description, url, logo, public_events, date_created) VALUES (4, 'Mangosteen', 'Neumühlequai 42', 'Zurich', 8006, 'Mangosteen Catering - Zürich Marriott Hotel', 'https://www.mangosteen.ch', 'https://www.mangosteen.ch/wp-content/uploads/sites/7/2016/06/logo-mangosteen-2016.png', false, {ts '2017-01-01'});
INSERT INTO companies (id, name, address, city, postal_code, description, url, logo, public_events, date_created) VALUES (5, 'Patata', 'Theaterspektakel 2015 - Landiwiese', 'Zurich', 8000, 'Beiz mit Chich und Schale', 'http://www.patata.ch', 'http://www.patata.ch/images/Patata-Logo.png', true, {ts '2017-01-01'});
INSERT INTO companies (id, name, address, city, postal_code, description, url, logo, public_events, date_created) VALUES (6, 'Edelweiss Catering', 'Bahnhofstrasse 100', 'Zurich', 8000, 'Eventmanagement-Firma', 'http://www.edelweiss-catering.ch/', 'http://www.edelweisscatering.ch/wp-content/uploads/2015/03/edelweiss_catering_def.png', true, {ts '2017-01-01'});

INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (1, 'Satuk', 'Kolan', 'password', 'satuk@kolan.ch', 'Im Brünneli 8', 33, 8127, 0793085018, 'Maur', {ts '2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (2, 'Ceylan', 'Kolan', 'password', 'ceylan@kolan.ch', 'Im Brünneli 8', 29, 8127, 0790000000, 'Maur', {ts '2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city,
date_created) VALUES (3, 'Tobias', 'Tomczak', 'password', 'tobi@muster.ch', 'Bahnhofstrasse 100', 55, 8000, 0790000000, 'Zürich', {ts '2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (4, 'Simona', 'Mühlebach', 'password', 'simona@muster.ch', 'Bahnhofstrasse 100', 55, 8000, 0790000000, 'Zürich', {ts
'2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city,
date_created) VALUES (5, 'Anna', 'Widmer', 'password', 'anna@muster.ch', 'Bahnhofstrasse 100', 55, 8000, 0790000000, 'Zürich', {ts '2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city,
date_created) VALUES (6, 'Yusef', 'Habibi', 'password', 'yusef@muster.ch', 'Bahnhofstrasse 100', 55, 8000, 0790000000, 'Zürich', {ts '2017-01-01 00:00:00.00'});


INSERT INTO events (id, name, logo, date, start, end, different_location, expected_person, company_id, description,
date_created, visibility) VALUES (1, 'PLANET 105 WE LOVE IBIZA BOAT', 'http://zuerich.usgang.ch/uploadfile/flyer/751920.jpg', {ts '2017-10-10'}, {ts '2017-01-01 18:00:00.00'}, {ts '2017-01-01 23:59:00.00'}, 0, 400, 1, 'DJs Tanja La Croix, Sam, Alex Price, Dino Supreme Show',
{ts '2017-01-01'}, true );
INSERT INTO events (id, name, logo, date, start, end, different_location, expected_person, company_id, description, date_created, visibility) VALUES (2, 'BAD ATTITUDE
', 'http://zuerich.usgang.ch/uploadfile/flyer/752716.jpg', {ts '2017-01-01'}, {ts '2017-01-01 12:00:00.00'}, {ts
'2017-01-01 23:00:00.00'}, 0, 400, 1,'Reggaeton und RnB',{ts '2017-01-01'}, true );
INSERT INTO events (id, name, logo, date, start, end, different_location, expected_person, company_id,  description,date_created, visibility) VALUES (3, 'HIT MACHINE
', 'http://zuerich.usgang.ch/uploadfile/flyer/750729.jpg', {ts '2017-01-01'}, {ts '2017-01-01 14:00:00.00'}, {ts '2017-01-01 22:30:00.00'}, 0, 200, 2, 'Party',{ts '2017-01-01'}, true );
INSERT INTO events (id, name, logo, date, start, end, different_location, expected_person, company_id,  description,date_created, visibility) VALUES (4, 'HARDTURM FESTIVAL - OUT OF CONTROL', 'http://zuerich.usgang.ch/uploadfile/flyer/749641.jpg', {ts '2017-01-01'}, {ts '2017-01-01 14:00:00.00'}, {ts '2017-01-01 22:00:00.00'}, 0, 33, 3,'Hip Hop, House und Mash Up', {ts '2017-01-01'}, true );


INSERT INTO users_companies(user_id, companies_id) VALUES (1, 1);
INSERT INTO users_companies(user_id, companies_id) VALUES (1, 2);
INSERT INTO users_companies(user_id, companies_id) VALUES (1, 3);

INSERT INTO users_companies(user_id, companies_id) VALUES (2, 1);
INSERT INTO users_companies(user_id, companies_id) VALUES (2, 2);

INSERT INTO users_companies(user_id, companies_id) VALUES (3, 3);
INSERT INTO users_companies(user_id, companies_id) VALUES (3, 2);


INSERT INTO works(id, date_created, event_id, user_id) VALUES (1, {ts '2017-01-01 00:00:00.00'}, 1, 1);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (2, {ts '2017-01-01 00:00:00.00'}, 3, 1);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (3, {ts '2017-01-01 00:00:00.00'}, 2, 1);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (4, {ts '2017-01-01 00:00:00.00'}, 2, 2);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (5, {ts '2017-01-01 00:00:00.00'}, 2, 3);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (6, {ts '2017-01-01 00:00:00.00'}, 3, 3);


INSERT INTO applications(id, date_created, event_id, user_id) VALUES (1, {ts '2017-01-01 00:00:00.00'}, 1, 1);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (2, {ts '2017-01-01 00:00:00.00'}, 2, 1);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (3, {ts '2017-01-01 00:00:00.00'}, 3, 1);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (4, {ts '2017-01-01 00:00:00.00'}, 3, 4);

INSERT INTO applications(id, date_created, event_id, user_id) VALUES (5, {ts '2017-01-01 00:00:00.00'}, 1, 2);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (6, {ts '2017-01-01 00:00:00.00'}, 1, 3);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (7, {ts '2017-01-01 00:00:00.00'}, 1, 4);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (8, {ts '2017-01-01 00:00:00.00'}, 1, 5);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (9, {ts '2017-01-01 00:00:00.00'}, 1, 6);
