package com.example.runnersApp.service;

import com.example.runnersApp.model.Content;
import com.example.runnersApp.model.Status;
import com.example.runnersApp.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContentService {
    Content addContent(Content content);
    Content updateContent(Content content);
    void deleteContent(Integer contentId);
    Page<Content> getAllContent(Pageable pageable);
    List<Content> getContentByUser(Integer userId);
    long getNumberOfContentsByTypeByUser(Integer userId, Type type);
    long getNumberOfContentsByStatus(Status status);
}