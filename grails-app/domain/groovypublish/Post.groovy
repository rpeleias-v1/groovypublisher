package groovypublish

class Post {

    static hasMany = [comments:Comment]

	String title;
	String teaser;
	String content
	Date lastModified
	Boolean published = false
	SortedSet comments
		
    static constraints = {
    	title(nullable:false, blank:false, length:1..50)
    	teaser(length:1..100)
    	content(nullable:false, blank:false)
    	lastModified(nullable:false)
    	published(nullable:false)
    }

    
}
