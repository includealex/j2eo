package tree;

import java.util.ArrayList;

public class Dims extends Entity
{
    // Structure
    public ArrayList<Dim> dimensions;

    // Creation
    public Dims(Dim dim)
    {
        this.dimensions = new ArrayList<>();
        this.dimensions.add(dim);
    }
    public Dims add(Dim dim)
    {
        this.dimensions.add(dim);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        for (int i=1; i<=dimensions.size(); i++)
            System.out.print("[]");
    }

    // Generation
    public void generateEO()
    {

    }
}