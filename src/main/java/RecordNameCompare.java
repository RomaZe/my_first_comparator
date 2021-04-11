import java.util.Comparator;

public class RecordNameCompare implements Comparator<Records> {
    public int compare(Records rec1, Records rec2)
    {
        return rec1.getRecordName().compareTo(rec2.getRecordName());
    }
}
