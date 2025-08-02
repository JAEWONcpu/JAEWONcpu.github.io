-- 일정 테이블 생성
CREATE TABLE schedule (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          title VARCHAR(255) NOT NULL,
                          content TEXT,
                          writer VARCHAR(100) NOT NULL,
                          created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                          updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 댓글 테이블 생성
CREATE TABLE comment (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         content TEXT NOT NULL,
                         writer VARCHAR(100) NOT NULL,
                         created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                         updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                         schedule_id BIGINT NOT NULL,
                         FOREIGN KEY (schedule_id) REFERENCES schedule(id) ON DELETE CASCADE
);

-- 유저 테이블 생성
CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       email VARCHAR(100) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       name VARCHAR(50) NOT NULL,
                       created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                       updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 일정-유저 관계 추가 (나중에 외래키 추가)
ALTER TABLE schedule ADD COLUMN user_id BIGINT;
ALTER TABLE schedule ADD CONSTRAINT fk_schedule_user FOREIGN KEY (user_id) REFERENCES users(id);

-- 댓글-유저 관계 추가 (나중에 외래키 추가)
ALTER TABLE comment ADD COLUMN user_id BIGINT;
ALTER TABLE comment ADD CONSTRAINT fk_comment_user FOREIGN KEY (user_id) REFERENCES users(id);