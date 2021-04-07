package com.ashish.upgrad.Blog.controller;
import com.ashish.upgrad.Blog.model.Post;
import com.ashish.upgrad.Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
@RestController

public class PostController
{
    @Autowired
    private PostService postService;

    /*
    /posts      - get
    /posts/id   - get
    /posts      - post
    /posts/id   - delete
    /posts/id   - put
    */

    //@RequestMapping(value="/posts",method=RequestMethod.GET)

    @RequestMapping("/posts")
    //localhsot:8080/posts - get (response is json)

    public List<Post> getAllPosts()
    {
        System.out.println("a");
        return this.postService.getAllPosts();
    }

    //@RequestMapping(value="/posts{id}",method=RequestMethod.GET)

    @RequestMapping("/posts/{id}")
    public Post getPost(@PathVariable Integer id)
    {
        return this.postService.getPost(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/posts")
    public String addPost(@RequestBody Post post)
    {
        post.setDate(new Date());
        postService.addPost(post);
        String response ="{\"success\":true,\"message\":\"Post has been added successfully\"}";
        return response;
    }

    @DeleteMapping("/posts/{id}")
    public String deletePosts(@PathVariable Integer id)
    {
        this.postService.deletePost(id);
        String response="{\"success\":true,\"message\":\"Post has been deleted successfully\"}";
        return response;
    }


}
