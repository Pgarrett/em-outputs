import random

def get_random_strings(strings_list, count=10):
    """
    Returns a specified number of random strings from the given list.

    :param strings_list: List of strings to select from.
    :param count: Number of random strings to return (default is 10).
    :return: List of randomly selected strings.
    """
    if count > len(strings_list):
        raise ValueError("Count cannot be greater than the number of available strings.")
    
    return random.sample(strings_list, count)

# Example usage
if __name__ == "__main__":
    my_strings = [ "getOnProjectsWithQueryParamsEmptyQReturnsEmptyList", "getOnStatisticsContributorsWithQueryParamEmptyOrganizationsShowsFaults_100_200", "getOnContributorsWithQueryParamsEmptyQShowsFaults_100_200", "getOnProjectsWithQueryParamsNegativeOffsetShowsFaults_100_200", "getOnStatisticsLanguagesWithQueryParamEmptyStart_dateReturnsSchemaInvalidResponse", "getOnProjectsWithQueryParamsNegativeLimitReturnsSchemaInvalidResponse", "getOnProjectsWithQueryParamsEmptySortByReturnsEmptyList", "getOnStatisticsContributorsWithQueryParamsEmptySortByShowsFaults_100_200", "getOnContributorsWithQueryParamsNegativeLimitShowsFaults_100_200", "getOnContributorsWithQueryParamsEmptySortByAndEmptyQShowsFaults_100_200UsingSql", "getOnContributorsWithQueryParamsEmptySortByShowsFaults_100_200", "getOnExportWithQueryParamsEmptyOrganizationsReturnsSchemaInvalidResponseUsingSql", "getOnDeleteWithQueryParamsEmptyAccess_tokenReturnsSchemaInvalidResponse", "getOnFetchWithQueryParamEmptyAccess_tokenReturnsSchemaInvalidResponse", "getOnLanguagesWithQueryParamsEmptyAccess_tokenReturnsSchemaInvalidResponse", "getOnExportWithQueryParamsEmptyAccess_tokenReturnsSchemaInvalidResponse", "getOnContributorsWithQueryParamsEmptyAccess_tokenReturnsSchemaInvalidResponse", "getOnLanguagesWithQueryParamsNegativeLimitReturnsSchemaInvalidResponseUsingSql", "getOnExportWithQueryParamsEmptyLimitReturnsSchemaInvalidResponse", "getOnLanguagesWithQueryParamsNegativeOffsetEmptyQReturnsSchemaInvalidResponse", "getOnContributorsWithQueryParamsEmptyOrganizationsReturnsSchemaInvalidResponse", "getOnContributorsWithQueryParamsNegativeOffsetReturnsSchemaInvalidResponse", "getOnProjectsWithQueryParamsEmptySortByAndEmptyQAndEmptyLanguageReturnsSchemaInvalidResponseUsingSql", "postOnAnnotationGenomicWithQueryParamsEmptyTokenReturns200UsingMongo", "getOnV1RefundsWithQueryParamsEmptyFrom_settled_dateShowsFaults_100_200", "getOnV1PaymentsWithQueryParamsEmptyCardholder_nameAndEmptyFrom_settled_dateShowsFaults_100_200", "getOnV1PaymentsWithQueryParamsEmptyCard_brandShowsFaults_100_200", "getOnV1PaymentsWithQueryParamsEmptyFirst_digits_card_numberReturnsSchemaInvalidResponse", "getOnSessionQueryWithQueryParamsEmptyValueReturnsSchemaInvalidResponseUsingMongo", "getOnHospitaisMaisProximoWithQueryParamsNegativeLonAndNegativeRaioMaximoShowsFaults_100_200UsingMongo", "getOnHospitaiHospitaisProximosWithQueryParamNegativeRaioReturnsSchemaInvalidResponseUsingMongo", "postOnHospitaiTransferenciaWithQueryParamsEmptyLonReturnsSchemaInvalidResponse", "getOnV2NameWithQueryParamsFullTextEmptyFieldsReturnsSchemaInvalidResponse", "getOnV1AlphaWithQueryParamsEmptyCodesReturnsSchemaInvalidResponse", "getOnV1NameWithQueryParamFullTextReturnsSchemaInvalidResponse", "getOnCustomerCartWithQueryParamsEmptyNameAndEmptyIncludedReturnsSchemaInvalidResponseUsingSql", "putOnCartDeliveryWithQueryParamsIncludedReturnsSchemaInvalidResponse", "putOnCartDeliveryWithQueryParamsIncludedEmptyNameReturnsSchemaInvalidResponse", "deleteOnNewWithQueryParamsEmptyCountryReturns204UsingSql", "putOnNewTextWithQueryParamsEmptyEMextraParam123Returns204UsingSql", "getOnV1CategoriesWithQueryParamsEmptyAttrsReturnsEmptyListUsingSql", "getOnV2TagsWithQueryParamsNegativeMin_activities_countReturnsEmptyListUsingSql", "getOnV1CategoriesWithQueryParamsNegativeMin_activities_countReturnsEmptyListUsingSql", "getOnV2ActivitiesWithQueryParamsNegativeRatings_average_minReturnsEmptyListUsingSql", "getOnV2ActivitiesWithQueryParamsFeaturedNegativeRandomReturnsEmptyListUsingSql", "getOnV2ActivitiesWithQueryParamsFeaturedReturnsEmptyListUsingSql", "getOnV2ActivitiesWithQueryParamsNegativeRandomAndNegativeFavouritesReturnsEmptyListUsingSql", "postOnV2ActivitiesWithQueryParamsEmptyRatings_count_minReturns400", "postOnV1ActivitiesWithQueryParamsEmptyParticipantsReturns400", "postOnV2ActivitiesWithQueryParamsEmptyCategoriesReturns400UsingSql", "getOnV2ActivitiesWithQueryParamsFeaturedEmptyAgesReturns400", "getOnV1ActivitiesWithQueryParamsNegativeFavouritesReturns400", "getOnV1UserWithQueryParamsEmptyMy_favouritesReturns403UsingSql", "postOnV1UsersWithQueryParamEmptyAttrsCauses500_internalServerError", "deleteOnV1Media_filWithQueryParamsVerify_unusedCauses500_internalServerError", "getOnMedia_filFileWithQueryParamNegativeSizeCauses500_internalServerErrorUsingSql", "postOnV2ActivitiesWithQueryParamsEmptyRatings_average_minCauses500_internalServerErrorUsingSql", "getOnV2ActivitiesWithQueryParamsEmptyNameAndEmptyParticipantsCauses500_internalServerError", "getOnV2ActivitiesWithQueryParamsNegativeFavouritesCauses500_internalServerError", "getOnV2ActivitiesWithQueryParamsNegativeRatings_count_minCauses500_internalServerError", "getOnV2ActivitiesWithQueryParamsMy_favouritesNegativeRatings_average_minCauses500_internalServerErrorUsingSql", "getOnV1ActivitiesWithQueryParamsFeaturedCauses500_internalServerError", "getOnV1ActivitiesWithQueryParamsNegativeRatings_count_minCauses500_internalServerError", "getOnV1ActivitiesWithQueryParamsFeaturedAndMy_favouritesCauses500_internalServerError", "getOnV1ActivitiesWithQueryParamsMy_favouritesCauses500_internalServerError", "getOnV1ActivitiesWithQueryParamsMy_favouritesNegativeRandomEmptyCategoriesCauses500_internalServerErrorUsingSql" ]
    
    random_strings = get_random_strings(my_strings, count=10)
    print("Random strings:", random_strings)
