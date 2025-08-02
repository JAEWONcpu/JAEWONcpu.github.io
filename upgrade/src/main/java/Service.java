import java.util.List;

public class Service {
}

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public Schedule getSchedule(Long id) {
        return scheduleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("일정을 찾을 수 없습니다."));
    }

    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    public Schedule updateSchedule(Long id, Schedule updatedSchedule) {
        Schedule schedule = getSchedule(id);
        schedule.setTitle(updatedSchedule.getTitle());
        schedule.setContent(updatedSchedule.getContent());
        schedule.setWriter(updatedSchedule.getWriter());
        return scheduleRepository.save(schedule);
    }

    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final ScheduleRepository scheduleRepository;

    public CommentService(CommentRepository commentRepository, ScheduleRepository scheduleRepository) {
        this.commentRepository = commentRepository;
        this.scheduleRepository = scheduleRepository;
    }

    public Comment createComment(Long scheduleId, Comment comment) {
        Schedule schedule = scheduleRepository.findById(scheduleId)
                .orElseThrow(() -> new RuntimeException("일정을 찾을 수 없습니다."));
        comment.setSchedule(schedule);
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsBySchedule(Long scheduleId) {
        return commentRepository.findByScheduleId(scheduleId);
    }

    public Comment updateComment(Long commentId, Comment updatedComment) {
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new RuntimeException("댓글을 찾을 수 없습니다."));
        comment.setContent(updatedComment.getContent());
        comment.setWriter(updatedComment.getWriter());
        return commentRepository.save(comment);
    }

    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}

@RestController
@RequestMapping("/api/schedules/{scheduleId}/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public ResponseEntity<Comment> createComment(@PathVariable Long scheduleId, @RequestBody Comment comment) {
        Comment created = commentService.createComment(scheduleId, comment);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Comment>> getComments(@PathVariable Long scheduleId) {
        List<Comment> comments = commentService.getCommentsBySchedule(scheduleId);
        return ResponseEntity.ok(comments);
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long commentId, @RequestBody Comment comment) {
        Comment updated = commentService.updateComment(commentId, comment);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId) {
        commentService.deleteComment(commentId);
        return ResponseEntity.noContent().build();
    }
}