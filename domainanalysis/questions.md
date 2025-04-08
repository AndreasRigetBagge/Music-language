# Questions from the book

## Q1: Purpose

*What is the purpose of the language?*

A language for music enthusiasts to define, organize and navigate collections of music.

*What are the use cases?*

- I want to have a collection of all my music media independent of their physical location. (Collection)
- I want to express my own organization of music - not just Artist/Album (Preferences + Collection)
- PlayLists
	- I want to make "normal" playlists of songs in order
	- I want to make "advanced" playlists based on queries
	- I want to customize how a playlist is played (e.g. play entire albums, artist, random songs, sleep timer, loop)
- I want to present my collection to other people (e.g. to share a list of favorite albums) (model to text)
- I want to import and export collections to JSON or XML (model test)


## Q2: StakeHolders.

*Who are the key stakeholders and the intended users of the language?*

Prioritized list:

1. ⭐️Music collectors (enthusiasts, DJ's)
2. Music producers / songWriters
3. Physical media traders (discogs users)
4. Archivists or researchers

## Q3: Concepts.

*What are the key domain concepts that users care about?*

- PlayList (simple, advanced)
- Recommendation
- Collection
- Object
	- Album
	- Song / Track
- Location / source
- Categorizations / properties
	- Genre
	- Artist
	- Format
	- User defined Folder*
	- Tag
	- Rating
- Notes
	- Lyrics
	- Attachment (like a booklet)
	- Log / journal
- Link
	- Reference
	- Sequence
	- Version

## Q4: Relations. 

*How are domain concepts related, and what are their relevant properties?*

There may be many versions of a track, there may be only one, or there may be none.
The track is an abstract representation.
A track with versions must have a default version (first entry).
It can have properties that act as overridable default properties for versions.
Versions are like a subclass of track and can be used in place of a track anywhere a track is references.

A track can none or multiple locations where a physical recording of it exists.*
The user can query for tracks that are available to them at the given time.

## Q5: Examples. 

*What examples of language instances are available or can be prototyped?*

