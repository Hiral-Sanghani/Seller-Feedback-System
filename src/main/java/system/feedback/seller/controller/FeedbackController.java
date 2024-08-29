package system.feedback.seller.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import system.feedback.seller.model.Feedback;
import system.feedback.seller.service.FeedbackService;
import system.feedback.seller.service.FeedbackServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FeedbackController {

    private static final Logger log = LoggerFactory.getLogger(FeedbackController.class);

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/feedback")
    public List<Feedback> getAllFeedback() {
        log.info("Request for fetching all feedbacks:  ");
        return feedbackService.fetchAllFeedbacks();
    }

    @PostMapping("/feedback")
    public ResponseEntity createFeedback(@RequestBody Feedback feedback) {
        log.info("Request for creating feedback:  {}", feedback);
        return feedbackService.createFeedback(feedback);
    }

    @GetMapping("/feedback/{sellerName}")
    public Optional<Feedback> fetchFeedbackBySellerName(@PathVariable String sellerName) {
        log.info("Request for get feedback by seller name:  {}", sellerName);
        return feedbackService.fetchFeedbackBySellerName(sellerName);
    }

}
