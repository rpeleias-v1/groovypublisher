package groovypublish

import grails.test.*

class PostTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()	
    }

    void testCrud() {
    	Post post = new Post(title: "Title", teaser: "Teaser", content: "Content", published: false)
    	
    	post.save()

    	def id = post.id
    	Post retrievedPost = Post.get(id)

    	assertEquals("Title", retrievedPost.title)
    	assertNull(Post.get(10))

    	post.published = true
    	post.save()

    	retrievedPost = Post.get(id)
    	assertEquals(true, retrievedPost.published)

    	post.delete()
    	assertEquals(null, Post.get(id))
    }
}
