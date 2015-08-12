package com.ws.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ws.vo.Post;

@Path("post")
public class PostService {
	
	List<Post> postList = new ArrayList<Post>();
	public void init(){

		Post post = new Post();
		post.setId(1);
		post.setTitle("Post 1");
		post.setContent("post 1 desc");
		postList.add(post);
		
		Post post1 =  new Post();
		post1.setId(2);
		post1.setTitle("Post 2");
		post1.setContent("Post 2 desc");
		postList.add(post1);
		
		Post post3 =  new Post();
		post1.setId(3);
		post1.setTitle("Post 3");
		post1.setContent("Post 3 desc");
		postList.add(post3);
	}
	

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Post getPost(@PathParam("id") int id) {
		init();
		Post result = null;
		for(Post p: postList){
			if(p.getId() == id){
				result = p;
			}
		}
		return result;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Post> getPosts() {
		
		init();
		return postList;
		
	}
}
