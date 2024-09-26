package Member;

import book.Book;

import java.util.ArrayList;
import java.time.LocalDate;

public class Member {
    private String member_id;
    private final String member_name;

    private static final ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Book> borrowedBooks;  // List to store borrowed books


    public Member(String memberName, String memberId) {
        this.member_name = memberName;
        this.member_id = memberId;
        borrowedBooks = new ArrayList<>();
        members.add(this);
    }

    public String getMember_id() {
        return member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public static Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMember_id().equalsIgnoreCase(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setAvailable(false);  // Update book availability in Library class
        System.out.println("Successfully borrowed " + book.getTitle() + " by " + book.getAuthor().getAuthor_name() + ".");
        System.out.println("Borrowed on: " + LocalDate.now());  // Record borrow date
    }
}

