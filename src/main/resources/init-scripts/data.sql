

-- Clear previous data
DELETE
FROM lecture_history;
DELETE
FROM lecture_schedule;
DELETE
FROM lecture;

-- Restart ID counters
ALTER TABLE lecture
    ALTER COLUMN id RESTART WITH 1;
ALTER TABLE lecture_schedule
    ALTER COLUMN id RESTART WITH 1;
ALTER TABLE lecture_history
    ALTER COLUMN id RESTART WITH 1;

-- Insert data into lecture table
INSERT INTO lecture (lecture_name, professor_name, create_date_time, update_date_time)
VALUES ('TDD', '홍길동', '2024-12-26 12:00:00', '2024-12-26 12:00:00'),
       ('Clean Architecture', '강길동', '2024-12-26 12:00:00', '2024-12-26 12:00:00');

-- Insert data into lecture_schedule table
INSERT INTO lecture_schedule (lecture_id, lecture_date_time, register_cnt, capacity, create_date_time)
VALUES (1, '2024-12-26 13:00:00', 0, 30, '2024-12-26 12:00:00'),
       (1, '2025-1-04 13:00:00', 0, 30, '2024-12-26 12:00:00'),
       (1, '2025-1-11 13:00:00', 0, 30, '2024-12-26 12:00:00'),
       (1, '2025-1-18 13:00:00', 0, 30, '2024-12-26 12:00:00'),
       (2, '2024-12-26 13:00:00', 0, 30, '2024-12-26 12:00:00'),
       (2, '2025-1-04 13:00:00', 0, 30, '2024-12-26 12:00:00');
