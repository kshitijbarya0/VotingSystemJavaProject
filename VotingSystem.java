import java.util.HashMap;
import java.util.Scanner;

class votes {
    public String voter_name;
    public int voter_id;

    public int getvoter_id() {
        return voter_id;
    }

    public votes(int voter_id) {
        this.voter_id = voter_id;
    }

    public votes(String voter_name) {
        this.voter_name = voter_name;
    }

    public void setvoter_id(int voter_id) {
        this.voter_id = voter_id;
    }

    public void setvoter_name(String voter_name) {
        this.voter_name = voter_name;
    }

    public String getvoter_name() {
        return voter_name;
    }

    public void printdetails() {
        System.out.println("user has voted with voter id " + voter_id);
    }

}

class nominee {
    public String nominee_name;
    public int nominee_id;

    public int getNominee_id() {
        return nominee_id;
    }

    public nominee(int nominee_id) {
        this.nominee_id = nominee_id;
    }

    public nominee(String nominee_name) {

        this.nominee_name = nominee_name;
    }

    public void setNominee_id(int nominee_id) {
        this.nominee_id = nominee_id;
    }

    public void setNominee_name(String nominee_name) {
        this.nominee_name = nominee_name;
    }

    public String getNominee_name() {
        return nominee_name;
    }

}

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<nominee, nominee> NomineeDetails = new HashMap<nominee, nominee>();
        HashMap<votes, Integer> VoterDetails = new HashMap<votes, Integer>();
        HashMap<votes, votes> UserDetails = new HashMap<votes, votes>();
        NomineeDetails.put(new nominee(1), new nominee("TRS"));
        NomineeDetails.put(new nominee(2), new nominee("BJP"));
        NomineeDetails.put(new nominee(3), new nominee("CONGRESS"));
        NomineeDetails.put(new nominee(4), new nominee("CPI"));
        System.out.println("-----------------Welcome to virtual voting----------------------");
        System.out.println("                           ");

        System.out.println("Pls enter no of voters");
        int voters = sc.nextInt();
        while (voters != 0) {
            System.out.println("enter last 4 digits of your aadhar");
            int VoterId = sc.nextInt();
            System.out.println("Enter voter name");
            String VoterName = sc.next();
            System.out.println("Choose whom to vote");
            System.out.println("for TRS enter 1");
            System.out.println("for BJP enter 2");
            System.out.println("for CONGRESS enter 3");
            System.out.println("for CPI enter 4");
            int NomineeId = sc.nextInt();
            votes v = new votes(VoterId);
            if (VoterDetails.keySet().contains(v)) {
                System.out.println("You have already voted");
            } else {
                VoterDetails.put(new votes(VoterId), NomineeId);
                UserDetails.put(new votes(VoterId), new votes(VoterName));
            }
            voters--;
        }
        int winners = 0;
        int TrsVotes, BjpVotes, CongressVotes, CpiVotes;
        TrsVotes = BjpVotes = CongressVotes = CpiVotes = 0;
        System.out.println("Displaying TRS party voters: ");
        System.out.println("----------------------------");
        for (votes key : VoterDetails.keySet()) {
            if (VoterDetails.get(key).equals(1)) {
                key.printdetails();
                TrsVotes++;
            }
        }
        System.out.println("-----------------X---------------");

        System.out.println("Displaying BJP party voters: ");
        System.out.println("----------------------------");

        for (votes key : VoterDetails.keySet()) {
            if (VoterDetails.get(key).equals(2)) {
                key.printdetails();
                BjpVotes++;
            }
        }
        System.out.println("-----------------X---------------");
        System.out.println("Displaying Congress party voters: ");
        System.out.println("----------------------------");

        for (votes key : VoterDetails.keySet()) {
            if (VoterDetails.get(key).equals(3)) {
                key.printdetails();
                CongressVotes++;
            }
        }
        System.out.println("-----------------X---------------");
        System.out.println("Displaying CPI party voters: ");
        System.out.println("----------------------------");
        System.out.println("-----------------X---------------");

        for (votes key : VoterDetails.keySet()) {
            if (VoterDetails.get(key).equals(4)) {
                key.printdetails();
                CpiVotes++;
            }
        }
        int max = (Math.max(TrsVotes, Math.max(BjpVotes, Math.max(CongressVotes, CpiVotes))));
        if (TrsVotes == max) {
            System.out.println(" ");
            System.out.println("TRS has max votes");
            System.out.println("----------------------");
            winners++;
        }
        if (BjpVotes == max) {
            System.out.println(" ");

            System.out.println("BJP has max votes");
            System.out.println("----------------------");

            winners++;
        }
        if (CongressVotes == max) {
            System.out.println(" ");

            System.out.println("Congress has max votes");
            System.out.println("----------------------");

            winners++;
        }
        if (CpiVotes == max) {
            System.out.println(" ");

            System.out.println("Cpi has max votes");
            System.out.println("----------------------");

            winners++;
        }
        if (winners > 1) {
            System.out.println(" ");

            System.out.println("Hence it is draw");
        }
    }
}
