package com.endava.first.service;

import com.endava.first.mapping.objects.AnimeMapping;
import com.endava.first.model.Anime;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AnimeService {
    List<Integer> getAllAnimeId(final Optional<Integer> limit, final Optional<String> genre);
    Optional<Anime> getByAnimeId(final int animeId);
    List<Integer> getAllOrderedByRating(final Map<String, String> params);
}
