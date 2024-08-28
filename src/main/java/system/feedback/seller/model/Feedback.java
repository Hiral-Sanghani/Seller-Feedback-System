package system.feedback.seller.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sellerFeedbacks")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "seller_name")
    String sellerName;

    @Column(name = "rating")
    int rating;

    @Column(name = "review_text")
    String Review;
}
