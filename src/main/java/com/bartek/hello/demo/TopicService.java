package com.bartek.hello.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic(0, "element zerowy"),
//            new Topic(1, "Spring v1"),
//            new Topic(2, "Nauka Springa")
//    ));

    public List<Topic> getAllTopics() {
        return (List<Topic>) topicRepository.findAll();
    }

    public Topic getTopic(int id){
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(int id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(int id) {
        //topics.removeIf(t-> t.getId() == id);
        topicRepository.deleteById(id);
    }
}
