package tbcs.persistence;

import tbcs.model.feedback.Feedback;
import tbcs.util.FileUtil;

public class FeedbackRepository
{
    public void save(Feedback feedback)
    {
        FileUtil.write("feedback.txt", feedback.toString());
    }
}
