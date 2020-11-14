
package briefproject;
import java.util.*;

public class Assignment {
    private String title;
    private String description;
    private Date subDateTime;
    private int oralMark;
    private int totalMark;
 
    public Assignment()
    {
        
    }
    public Assignment(String title,String description,Date subDateTime)
    {
        this.title=title;
        this.description=description;
        this.subDateTime=subDateTime;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(Date subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }
    
}
