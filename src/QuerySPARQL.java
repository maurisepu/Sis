/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.hp.hpl.jena.query.* ;
import java.util.Iterator;
import java.util.StringTokenizer;
/**
 *
 * @author Diego Muñoz, Luis Ortega, Mauricio Sepúlveda, Claudio Torres
 */


public class QuerySPARQL {
    
    
    
    private String prefijos= "PREFIX owl: <http://www.w3.org/2002/07/owl#> " + 
            "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> "+
            "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"+
            "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
            "PREFIX foaf: <http://xmlns.com/foaf/0.1/>"+
            "PREFIX dc: <http://purl.org/dc/elements/1.1/>"+
            "PREFIX : <http://dbpedia.org/resource/>"+
            "PREFIX dbpedia2: <http://dbpedia.org/property/>"+
            "PREFIX dbpedia: <http://dbpedia.org/>"+
            "PREFIX skos: <http://www.w3.org/2004/02/skos/core#>\n";
    
    public QuerySPARQL(){
            
        
    }
    public String ConsultaMedicamento(String nombreMedicamento){
        String sparqlQueryString1=
             
             "SELECT ?s "+
            "WHERE { "+
            "?uri rdfs:label \""+nombreMedicamento+"\"@es ;"+
            "rdfs:comment ?s . "+
            "FILTER (lang(?s) = \"es\") "+
            "}";


      Query query = QueryFactory.create(prefijos+sparqlQueryString1);
      QueryExecution qexec = QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql", query);
      
      String lala = "";
      
      Iterator<QuerySolution> results = qexec.execSelect() ;
        for ( ; results.hasNext() ; )
        {
            QuerySolution soln = results.next() ;
            lala += soln.get("?s");
        }
      
      //ResultSet results = qexec.execSelect();
      //ResultSetFormatter.out(System.out, results, query);

     qexec.close() ;
     
     return lala;
     
    }

    
    public String ConsultaCancerMama(){
        String sparqlQueryString1=
             
             "SELECT  ?s "+
            "WHERE { "+
            "<http://dbpedia.org/resource/Breast_cancer> rdfs:comment ?s"+
            "  FILTER (lang(?s) = \"es\") }";


      Query query = QueryFactory.create(prefijos+sparqlQueryString1);
      QueryExecution qexec = QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql", query);
      
      String lala = "";
      
      Iterator<QuerySolution> results = qexec.execSelect() ;
        for ( ; results.hasNext() ; )
        {
            QuerySolution soln = results.next() ;
            lala += soln.get("?s");
        }
      
      //ResultSet results = qexec.execSelect();
      //ResultSetFormatter.out(System.out, results, query);

     qexec.close() ;
     
     StringTokenizer stk = new StringTokenizer(lala, ".y");
     
     String lal1 = stk.nextToken(); //informacion general
     String lal2 = stk.nextToken(); //primer tipo
     String lal3 = stk.nextToken(); //segundo tipo
     
     
     System.out.println(lala);
     return lala;
     
    }
    
    
}
