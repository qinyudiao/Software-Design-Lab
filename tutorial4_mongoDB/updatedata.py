from pymongo import MongoClient
#include pprint for readabillity of the 
from pprint import pprint

#change the MongoClient connection string to your MongoDB database instance
client = MongoClient("mongodb+srv://qinyudiao:hwdue8%408Cluster%2DEE461L@cluster-ee461l-2xvyd.mongodb.net/test?retryWrites=true&w=majority")
db=client.business

ASingleReview = db.reviews.find_one({})
print('A sample document:')
pprint(ASingleReview)

result = db.reviews.update_one({'_id' : ASingleReview.get('_id') }, {'$inc': {'likes': 1}})
print('Number of documents modified : ' + str(result.modified_count))

UpdatedDocument = db.reviews.find_one({'_id':ASingleReview.get('_id')})
print('The updated document:')
pprint(UpdatedDocument)

result = db.reviews.delete_many({"cuisine": "Bar Food"})
result = db.reviews.delete_many({"rating": 1})

# Now let's use the aggregation framework to sum the occurrence of each rating across the entire data set
print('\nThe sum of each rating occurance across all data grouped by rating ')
stargroup=db.reviews.aggregate(
# The Aggregation Pipeline is defined as an array of different operations
[
# The first stage in this pipe is to group data
{ '$group':
    { '_id': "$rating",
     "count" : 
                 { '$sum' :1 }
    }
},
# The second stage in this pipe is to sort the data
{"$sort":  { "_id":1}
}
# Close the array with the ] tag             
] )
# Print the result
for group in stargroup:
    print(group)
