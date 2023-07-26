CREATE TABLE videos (
    id LONG PRIMARY KEY,
    title VARCHAR(255),
    status VARCHAR(255)
);

CREATE TABLE members (
    id LONG PRIMARY KEY,
    name VARCHAR(255),
    video_id LONG,
    FOREIGN KEY (video_id) REFERENCES videos(id)
);
