import org.springframework.data.jpa.repository.JpaRepository;

public class Repository {public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    // 기본 CRUD 메서드는 JpaRepository가 제공
}
}

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByScheduleId(Long scheduleId);
}