package Commonclasses;

public class Bid {
    private int bidID;
    private int userID;
    private int itemID;
    private int bidAmount;
    private int minIncrement;
    private String bidTime;
    private boolean isWinningBid; // Flag indicating if the bid is the winning bid

    public Bid(int bidID, int userID, int itemID, int bidAmount, int minIncrement, String bidTime) {
        this.bidID = bidID;
        this.userID = userID;
        this.itemID = itemID;
        this.bidAmount = bidAmount;
        this.minIncrement = minIncrement;
        this.bidTime = bidTime;
        this.isWinningBid = false; // By default, the bid is not the winning bid
    }

    public int getBidID() {
        return bidID;
    }

    public void setBidID(int bidID) {
        this.bidID = bidID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public int getMinIncrement() {
        return minIncrement;
    }

    public void setMinIncrement(int minIncrement) {
        this.minIncrement = minIncrement;
    }

    public String getBidTime() {
        return bidTime;
    }

    public void setBidTime(String bidTime) {
        this.bidTime = bidTime;
    }

    public boolean isWinningBid() {
        return isWinningBid;
    }

    public void setWinningBid(boolean winningBid) {
        isWinningBid = winningBid;
    }
}