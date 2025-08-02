{
"openapi": "3.0.0",
"info": {
"title": "일정 관리 API",
"version": "1.0.0",
"description": "JPA를 활용한 일정 관리 서버 API 명세서입니다."
},
"paths": {
"/api/schedules": {
"post": {
"summary": "일정 생성",
"requestBody": {
"required": true,
"content": {
"application/json": {
"schema": {
"type": "object",
"properties": {
"writer": { "type": "string", "example": "재원" },
"title": { "type": "string", "example": "스터디 모임" },
"content": { "type": "string", "example": "오후 3시에 도서관에서" },
"createdAt": { "type": "string", "format": "date-time", "example": "2025-07-31T15:00:00" }
},
"required": ["writer", "title", "createdAt"]
}
}
}
},
"responses": {
"201": {
"description": "일정 생성 성공",
"content": {
"application/json": {
"schema": {
"$ref": "#/components/schemas/Schedule"
}
}
}
}
}
},
"get": {
"summary": "일정 전체 조회",
"responses": {
"200": {
"description": "일정 리스트 반환",
"content": {
"application/json": {
"schema": {
"type": "array",
"items": { "$ref": "#/components/schemas/Schedule" }
}
}
}
}
}
}
},
"/api/schedules/{id}": {
"get": {
"summary": "일정 단건 조회",
"parameters": [
{
"name": "id",
"in": "path",
"required": true,
"schema": { "type": "integer", "format": "int64" }
}
],
"responses": {
"200": {
"description": "일정 상세 정보",
"content": {
"application/json": {
"schema": { "$ref": "#/components/schemas/Schedule" }
}
}
},
"404": { "description": "일정 없음" }
}
},
"put": {
"summary": "일정 수정",
"parameters": [
{
"name": "id",
"in": "path",
"required": true,
"schema": { "type": "integer", "format": "int64" }
}
],
"requestBody": {
"required": true,
"content": {
"application/json": {
"schema": {
"type": "object",
"properties": {
"title": { "type": "string", "example": "스터디 장소 변경" },
"content": { "type": "string", "example": "카페로 변경" },
"updatedAt": { "type": "string", "format": "date-time", "example": "2025-07-31T16:00:00" }
}
}
}
}
},
"responses": {
"200": {
"description": "수정된 일정 반환",
"content": {
"application/json": {
"schema": { "$ref": "#/components/schemas/Schedule" }
}
}
},
"404": { "description": "일정 없음" }
}
},
"delete": {
"summary": "일정 삭제",
"parameters": [
{
"name": "id",
"in": "path",
"required": true,
"schema": { "type": "integer", "format": "int64" }
}
],
"responses": {
"204": { "description": "삭제 성공" },
"404": { "description": "일정 없음" }
}
}
}
},
"components": {
"schemas": {
"Schedule": {
"type": "object",
"properties": {
"id": { "type": "integer", "format": "int64", "example": 1 },
"writer": { "type": "string", "example": "재원" },
"title": { "type": "string", "example": "스터디 모임" },
"content": { "type": "string", "example": "오후 3시에 도서관에서" },
"createdAt": { "type": "string", "format": "date-time", "example": "2025-07-31T15:00:00" },
"updatedAt": { "type": "string", "format": "date-time", "example": "2025-07-31T16:00:00" }
}
}
}
}
}


# 일정 관리 앱 서버

## 프로젝트 개요
JPA를 활용한 일정 관리 앱 서버입니다. 사용자는 일정을 등록하고 관리할 수 있으며, 댓글 기능과 회원 인증 기능을 제공합니다.

## 기술 스택
- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL
- JWT

## ERD (Entity Relationship Diagram)

```mermaid
erDiagram
    USER {
        Long id PK
        String email
        String password
        String name
        LocalDateTime createdAt
        LocalDateTime updatedAt
    }
    
    SCHEDULE {
        Long id PK
        String title
        String content
        LocalDateTime createdAt
        LocalDateTime updatedAt
        Long userId FK
    }
    
    COMMENT {
        Long id PK
        String content
        LocalDateTime createdAt
        LocalDateTime updatedAt
        Long scheduleId FK
        Long userId FK
    }
    
    USER ||--o{ SCHEDULE : "작성"
    USER ||--o{ COMMENT : "작성"
    SCHEDULE ||--o{ COMMENT : "포함"


