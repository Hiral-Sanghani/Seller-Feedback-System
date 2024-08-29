package system.feedback.seller.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import system.feedback.seller.model.Feedback;
import system.feedback.seller.repository.FeedbackRepository;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {
     List<Feedback> fetchAllFeedbacks();
     Optional<Feedback> fetchFeedbackBySellerName(String sellerName);
     ResponseEntity createFeedback(Feedback feedback);
}
