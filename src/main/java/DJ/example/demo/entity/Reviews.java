package DJ.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", nullable = false)
    private Long id;

    @ManyToOne // User -> Review
    @JoinColumn(name = "user_id")
    private Users reviewer;

    @ManyToOne // Post -> Review
    @JoinColumn(name = "post_id")
    private Posts post;

    @Lob
    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private Integer score;

    @Column(nullable = false)
    @org.hibernate.annotations.CreationTimestamp
    private LocalDateTime createdAt;

    @Column(nullable = false)
    @org.hibernate.annotations.UpdateTimestamp
    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
