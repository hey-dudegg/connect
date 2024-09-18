package DJ.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id", nullable = false)
    private Long id;

    @ManyToOne // Many = Posts, User = One
    @JoinColumn(name = "user_id")
    private Users author;

    @ColumnDefault("0")
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal score;

    @Column(nullable = false)
    private String link;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Integer numTesters;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String createdIp;

    @Column(nullable = false)
    private Boolean isGathered;

    @Column(nullable = false)
    private Boolean isHided;

    @Column(nullable = false, updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    private LocalDateTime postedAt;

    @Column(nullable = false)
    @org.hibernate.annotations.UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private LocalDateTime deletedAt;
}
