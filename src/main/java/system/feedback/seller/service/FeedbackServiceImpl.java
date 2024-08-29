package system.feedback.seller.service;

import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import system.feedback.seller.model.Feedback;
import system.feedback.seller.repository.FeedbackRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService {

    private FeedbackRepository feedbackRepository;

    public FeedbackServiceImpl(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public List<Feedback> fetchAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @Override
    public Optional<Feedback> fetchFeedbackBySellerName(String sellerName) {
        return feedbackRepository.findBySellerNameIgnoreCase(sellerName);
    }

    @Override
    public ResponseEntity<Feedback> createFeedback(Feedback feedback) {
        Feedback savedFeedback = feedbackRepository.save(feedback);
        return new ResponseEntity<>(savedFeedback,HttpStatus.CREATED);
    }
}
