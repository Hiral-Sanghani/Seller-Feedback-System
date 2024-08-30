package system.feedback.seller.service;

import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import system.feedback.seller.model.Feedback;
import system.feedback.seller.repository.FeedbackRepository;

import java.util.ArrayList;
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
        List<Feedback> list = new ArrayList<Feedback>();
        
        list.add(new Feedback(1L, "Int Solutions", 3, "Reviews"));
        list.add(new Feedback(2L, "Pari", 5, ""));
        list.add(new Feedback(3L, "Aahan", 1, "No commnets"));
        // return feedbackRepository.findAll();
        return list;
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
