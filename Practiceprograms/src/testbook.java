class TestBook
    {    String title,author;
        private void setTitle(String title)
        {     this.title = title;
        }
        private void setAuthor(String author)
        {     this.author=author;
        }
        private String getTitle() { return title; }
        private String getAuthor() { return author; }
        public static void main(String[ ] args)
        {    TestBook b1 = new TestBook();
            System.out.println(b1.hashCode());   // Hash Code
                b1.setTitle("The Java Programming: Second Edition");
            b1.setAuthor("Ken Arnold and James Gosling");
            System.out.println("Title: "+ b1.getTitle());
            System.out.println ("Author:" + b1.getAuthor() );    
        }
    }